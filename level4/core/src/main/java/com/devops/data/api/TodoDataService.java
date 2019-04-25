package com.devops.data.api;

import com.devops.domain.TodoItem;
import com.devops.domain.TodoItemList;

public interface TodoDataService {

	TodoItem getTodoById(final long id);

	TodoItemList getTodoListByUser(final long userId);

	TodoItemList getTodoListByUserAndTitle(final long userId, final String title);

	TodoItem create(final TodoItem todoItem);

	TodoItem update(TodoItem todoItem);

	void remove(final TodoItem todoItem);

}
