package defpackage;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes20.dex */
public final class SyncNicknameUsernameFrequencyControlModel {

    @C09CT("api")
    public final int apiInterval;

    @C09CT("popup")
    public final n popUpFrequency;

    public SyncNicknameUsernameFrequencyControlModel() {
        n nVar = new n();
        nVar.LJJIII(1, "5");
        nVar.LJJIII(3, "30");
        nVar.LJJIII(5, "99999");
        this(1, nVar);
    }

    public SyncNicknameUsernameFrequencyControlModel(int i, n nVar) {
        this.apiInterval = i;
        this.popUpFrequency = nVar;
    }
}
