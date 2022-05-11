package com.s22.digijournal.ui.task;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.s22.digijournal.R;
import com.s22.digijournal.databinding.FragmentTaskDetailsBinding;

public class TaskDetailsFragment extends Fragment
{
	private FragmentTaskDetailsBinding binding;
    private TaskViewModel viewModel;
    private TextView taskName;
    private TextView description;
    private TextView deadline;
    
    public TaskDetailsFragment()
    {
    
    }
    
    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        viewModel = new ViewModelProvider(requireActivity()).get(TaskViewModel.class);
        binding = FragmentTaskDetailsBinding.inflate(inflater, container, false);
        
        taskName = binding.taskDetailsTaskName;
        description = binding.taskDetailsDetailText;
        deadline = binding.taskDetailsDeadline;
        
        return binding.getRoot();
    }
    
    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        binding.fab.setOnClickListener(v -> NavHostFragment.findNavController(TaskDetailsFragment.this).navigate(R.id.action_nav_task_details_to_nav_add_task));
        binding.taskDetailsEditButton.setOnClickListener(v -> NavHostFragment.findNavController(TaskDetailsFragment.this).navigate(R.id.action_nav_task_details_to_nav_task_edit));
    }
    
    @Override public void onDestroyView()
    {
        super.onDestroyView();
        binding = null;
    }
}