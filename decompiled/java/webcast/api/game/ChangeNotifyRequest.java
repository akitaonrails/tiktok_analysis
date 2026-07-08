package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ChangeNotifyRequest {

    @C09CT("change_type")
    public int changeType;

    @C09CT("context_params")
    public ChangeNotifyContext contextParams;

    @C09CT("open_notify")
    public boolean openNotify;
}
