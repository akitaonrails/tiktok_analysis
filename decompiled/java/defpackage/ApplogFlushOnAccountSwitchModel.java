package defpackage;

import X.C09CT;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes5.dex */
public final class ApplogFlushOnAccountSwitchModel {

    @C09CT("should_flush")
    public final boolean shouldFlush;

    @C09CT("wait")
    public final int wait;

    public ApplogFlushOnAccountSwitchModel() {
        this(true, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
    }

    public ApplogFlushOnAccountSwitchModel(boolean z, int i) {
        this.shouldFlush = z;
        this.wait = i;
    }
}
