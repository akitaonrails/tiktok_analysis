package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import com.google.gson.n;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileComponents {

    @C09CT("actions")
    public List<Action> actions;

    @C09CT("biz_data")
    public n bizData;

    @C09CT("component_id")
    public String componentId;

    @C09CT("name")
    public String componentName;

    @C09CT("components")
    public List<? extends ProfileComponents> components;

    @C09CT("event_params")
    public List<EventParams> eventParams;

    @C09CT("ui_data")
    public ProfileUIData uiData;
}
