package com.commit451.gitlab.navigation;

import android.net.Uri;
import android.support.annotation.Nullable;

/**
 * Interface called when routing in the Routing activity
 */
public interface RoutingNavigator {
    void onRouteToIssue(String projectNamespace, String projectName, String issueIid);
    void onRouteToCommit(String projectNamespace, String projectName, String commitSha);
    void onRouteToMergeRequest(String projectNamespace, String projectName, String mergeRequestIid);
    void onRouteToProject(String projectNamespace, String projectName);
    void onRouteToBuild(String projectNamespace, String projectName, String buildNumber);
    void onRouteToMilestone(String projectNamespace, String projectName, String milestoneNumber);
    void onRouteUnknown(@Nullable Uri uri);
}
