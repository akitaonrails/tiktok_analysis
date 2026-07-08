package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuessTemplate {

    @C09CT("audit_detail")
    public long auditDetail;

    @C09CT("audit_status")
    public long auditStatus;

    @C09CT("template_id_str")
    public long templateIdStr;

    @C09CT("title")
    public GuessText title;

    @C09CT("guess_options")
    public List<GuessOptions> guessOptions = new ArrayList();

    @C09CT("game_type_name")
    public String gameTypeName = "";
}
