package com.ss.android.ugc.feed.platform.componentmanager.maker.next.service;

import X.C01GW;
import X.C0B65;
import X.C0B85;
import X.C0QSJ;
import X.C0SV3;
import X.C0T6L;
import X.C13LE;
import X.C1440005kM;
import X.C2038007yc;
import X.C20554315bp;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C708060Rq0;
import X.EnumC20654715s1;
import X.InterfaceC1146704e9;
import X.InterfaceC1273504yb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC698650Rap;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS151S1100000_2;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpServiceAssem extends BaseMainPageFragmentAssem implements InterfaceC1273504yb, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C708060Rq0(this));
    public volatile MainBusinessAbility LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public C0QSJ LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FcpServiceAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C0T6L.LIZLLL();
        C0T6L.LIZLLL();
        C20554315bp.LIZIZ.LIZ(EnumC20654715s1.FEED_COMPONENT, this);
        if (C0B85.LIZ()) {
            ((InterfaceC698650Rap) this.LLILLJJLI.getValue()).LIZ(new C0SV3(this));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C0B85.LIZ()) {
            ((InterfaceC698650Rap) this.LLILLJJLI.getValue()).LIZIZ();
        }
    }

    @Override // X.InterfaceC1273504yb
    public final void ac(String str, Map<String, Object> map) {
        ArrayList arrayList;
        Collection collection;
        new AwS151S1100000_2(str, (String) map, (Map<String, Object>) 17);
        C0T6L.LIZLLL();
        if (((Boolean) C0B65.LIZ.getValue()).booleanValue()) {
            Object obj = map.get("timing_list");
            if ((obj instanceof List) && (collection = (Collection) obj) != null) {
                arrayList = new ArrayList(collection);
            } else {
                arrayList = new ArrayList();
            }
        } else {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty()) {
            arrayList.add(str);
        }
        C1440005kM.LIZ(new C2038007yc("outreach", arrayList, map));
        boolean z = map.get("aweme_id") instanceof String;
    }
}
