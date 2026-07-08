package com.ss.android.ugc.aweme.favorites.business.music.raven;

import X.C01GW;
import X.C0X52;
import X.C1160990gJl;
import X.C1161000gJm;
import X.C11NZ;
import X.C1209010hZD;
import X.C452501pT;
import X.InterfaceC1160920gJe;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174708fZ;
import com.bytedance.hybrid.spark.raven.data.RavenPage;
import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class MusicCollectionRavenRequest implements InterfaceC1160920gJe {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(144));

    public interface MusicCollectionRavenApi {
        @InterfaceC1501160pAQ
        C11NZ<C0X52<RavenPage>> requestRaven(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str2, @InterfaceC1501070pAH("biz") String str3, @InterfaceC1501070pAH("cursor") String str4, @InterfaceC1501070pAH("enable_offline_similar_music") String str5, @InterfaceC1501130pAN Map<String, String> map);
    }

    @Override // X.InterfaceC1160920gJe
    public final C11NZ<C1161000gJm> LIZ(C1160990gJl c1160990gJl) {
        return C11NZ.LJIJJLI(new C1209010hZD(c1160990gJl, this, 0));
    }
}
