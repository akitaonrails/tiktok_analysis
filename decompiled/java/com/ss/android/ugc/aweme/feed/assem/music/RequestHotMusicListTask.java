package com.ss.android.ugc.aweme.feed.assem.music;

import X.C01GW;
import X.C0CCZ;
import X.C0LAB;
import X.C0VZ0;
import X.C11S5;
import X.C1701940uOG;
import X.C2258808t8;
import X.C2258908t9;
import X.C2341909Fp;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2342209Fs;
import Y.AfS1S0100100_3;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.api.HotMusicApi;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestHotMusicListTask implements C0CCZ {
    public final C01GW LL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(491));
    public final int LLILLJJLI = ((Number) C2258908t9.LIZ.getValue()).intValue();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "RequestHotMusicListTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2258808t8 c2258808t8 = (C2258808t8) this.LL.getValue();
        ((HotMusicApi) c2258808t8.LIZ.getValue()).getCurHotMusicList(this.LLILLJJLI).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS1S0100100_3(this, jCurrentTimeMillis, 0), new AfS1S0100100_3(this, jCurrentTimeMillis, 1));
    }

    public static void LIZ(int i, int i2, int i3, String str, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJ("api_type", "hot_topic_music_list");
        c0lab.LIZ(i2, "count");
        c0lab.LIZ(0, "is_preload");
        c0lab.LIZIZ(jCurrentTimeMillis, "duration");
        c0lab.LIZ(i3, "error_code");
        c0lab.LJ("error_msg", str);
        C2341909Fp.LIZ("tool_performance_api", c0lab.LIZ);
    }
}
