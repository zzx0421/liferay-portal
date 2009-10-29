/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.kernel.workflow;

import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;
import java.util.Map;

/**
 * <a href="WorkflowInstanceManagerUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author Micha Kiener
 * @author Shuyang Zhou
 * @author Brian Wing Shun Chan
 */
public class WorkflowInstanceManagerUtil {

	public static WorkflowInstance addContextInformation(
			long workflowInstanceId, Map<String, Object> context)
		throws WorkflowException {

		return _workflowInstanceManager.addContextInformation(
			workflowInstanceId, context);
	}

	public static List<String> getPossibleNextActivityNames(
			long workflowInstanceId, long userId,
			Map<String, Object> parameters)
		throws WorkflowException {

		return _workflowInstanceManager.getPossibleNextActivityNames(
			workflowInstanceId, userId, parameters);
	}

	public static List<String> getPossibleNextPathNames(
			long workflowInstanceId, long userId,
			Map<String, Object> parameters)
		throws WorkflowException {

		return _workflowInstanceManager.getPossibleNextPathNames(
			workflowInstanceId, userId, parameters);
	}

	public static WorkflowInstance getWorkflowInstance(
			long workflowInstanceId, boolean retrieveChildrenInfo)
		throws WorkflowException {

		return _workflowInstanceManager.getWorkflowInstance(
			workflowInstanceId, retrieveChildrenInfo);
	}

	public static int getWorkflowInstanceCount(
			String workflowDefinitionName, Integer workflowDefinitionVersion)
		throws WorkflowException {

		return _workflowInstanceManager.getWorkflowInstanceCount(
			workflowDefinitionName, workflowDefinitionVersion);
	}

	public static int getWorkflowInstanceCount(
			String workflowDefinitionName, Integer workflowDefinitionVersion,
			boolean completed)
		throws WorkflowException {

		return _workflowInstanceManager.getWorkflowInstanceCount(
			workflowDefinitionName, workflowDefinitionVersion, completed);
	}

	public static List<WorkflowInstance> getWorkflowInstances(
			String workflowDefinitionName, Integer workflowDefinitionVersion,
			boolean completed, boolean retrieveChildrenInfo, int start, int end,
			OrderByComparator orderByComparator)
		throws WorkflowException {

		return _workflowInstanceManager.getWorkflowInstances(
			workflowDefinitionName, workflowDefinitionVersion, completed,
			retrieveChildrenInfo, start, end, orderByComparator);
	}

	public static List<WorkflowInstance> getWorkflowInstances(
			String workflowDefinitionName, Integer workflowDefinitionVersion,
			boolean retrieveChildrenInfo, int start, int end,
			OrderByComparator orderByComparator)
		throws WorkflowException {

		return _workflowInstanceManager.getWorkflowInstances(
			workflowDefinitionName, workflowDefinitionVersion,
			retrieveChildrenInfo, start, end, orderByComparator);
	}

	public static WorkflowInstanceManager getWorkflowInstanceManager() {
		return _workflowInstanceManager;
	}

	public static void removeWorkflowInstance(long workflowInstanceId)
		throws WorkflowException {

		_workflowInstanceManager.removeWorkflowInstance(workflowInstanceId);
	}

	public static WorkflowInstance signalWorkflowInstance(
			long workflowInstanceId, Map<String, Object> attributes,
			long callingUserId, Map<String, Object> parameters)
		throws WorkflowException {

		return _workflowInstanceManager.signalWorkflowInstance(
			workflowInstanceId, attributes, callingUserId, parameters);
	}

	public static WorkflowInstance signalWorkflowInstanceByActivity(
			long workflowInstanceId, String activityName,
			Map<String, Object> attributes, long callingUserId,
			Map<String, Object> parameters)
		throws WorkflowException {

		return _workflowInstanceManager.signalWorkflowInstanceByActivity(
			workflowInstanceId, activityName, attributes, callingUserId,
			parameters);
	}

	public static WorkflowInstance signalWorkflowInstanceByPath(
			long workflowInstanceId, String pathName,
			Map<String, Object> attributes, long callingUserId,
			Map<String, Object> parameters)
		throws WorkflowException {

		return _workflowInstanceManager.signalWorkflowInstanceByPath(
			workflowInstanceId, pathName, attributes, callingUserId,
			parameters);
	}

	public static WorkflowInstance startWorkflowInstance(
			String workflowDefinitionName, Integer workflowDefinitionVersion,
			Map<String, Object> context, long callingUserId,
			Map<String, Object> parameters)
		throws WorkflowException {

		return _workflowInstanceManager.startWorkflowInstance(
			workflowDefinitionName, workflowDefinitionVersion, context,
			callingUserId, parameters);
	}

	public static WorkflowInstance startWorkflowInstance(
			String workflowDefinitionName, Integer workflowDefinitionVersion,
			Map<String, Object> context, long callingUserId,
			String activityName, Map<String, Object> parameters)
		throws WorkflowException {

		return _workflowInstanceManager.startWorkflowInstance(
			workflowDefinitionName, workflowDefinitionVersion, context,
			callingUserId, activityName, parameters);
	}

	public void setWorkflowInstanceManager(
		WorkflowInstanceManager workflowInstanceManager) {

		_workflowInstanceManager = workflowInstanceManager;
	}

	private static WorkflowInstanceManager _workflowInstanceManager;

}