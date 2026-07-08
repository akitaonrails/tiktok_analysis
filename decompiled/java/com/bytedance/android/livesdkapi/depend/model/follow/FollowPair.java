package com.bytedance.android.livesdkapi.depend.model.follow;

import X.C09CT;
import X.EnumC1812050xFr;
import java.util.HashMap;

/* JADX INFO: loaded from: classes28.dex */
public class FollowPair {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;
    public EnumC1812050xFr LIZLLL = EnumC1812050xFr.Default;
    public boolean LJ;
    public HashMap<String, String> LJFF;
    public boolean LJI;

    @C09CT("follow_status")
    public int followStatus;

    public final int LIZ() {
        int i = this.followStatus;
        if (i < 0 || i > 2) {
            this.followStatus = 0;
        }
        return this.followStatus;
    }

    public final boolean LIZIZ() {
        int i = this.followStatus;
        return i == 2 || i == 1;
    }
}
