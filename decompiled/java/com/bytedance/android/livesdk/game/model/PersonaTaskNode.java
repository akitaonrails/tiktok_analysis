package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PersonaTaskNode {

    @C09CT("index")
    public int index;

    @C09CT("name_type")
    public int nameType;

    @C09CT("node_type")
    public int nodeType;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("name")
    public String name = "";

    @C09CT("node_step_setting_desc")
    public List<String> nodeStepSettingDesc = new ArrayList();
}
