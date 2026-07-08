package com.ss.android.ugc.aweme.search.pages.result.nimble.v2;

import X.C01GW;
import X.C01V8;
import X.C079J;
import X.C07E5;
import X.C0HHT;
import X.C13IQ;
import X.C13LE;
import X.C14NX;
import X.C15438062q;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C452501pT;
import X.C651970Phj;
import X.C651980Phk;
import X.C684930Qtn;
import X.C685160QuA;
import X.C685180QuC;
import X.C723830SaL;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.nimblecard.NimbleCardUIVM;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.search.pages.result.pov.mob.ITop1MobAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1NimbleCardAssem extends ReusedUISlotAssem<Top1NimbleCardAssem> implements InterfaceC712990Rxx<C684930Qtn>, INimbleContainerAbility, INimbleModelAbility {
    public static final C685160QuA LLJZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static Function2<? super Fragment, ? super Integer, NimbleTemplateContext> LLL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 612));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 608));
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public NimbleTemplateContext LLJLL;
    public final List<C13IQ<? extends ReusedUISlotAssem<?>>> LLJLLIL;
    public final List<C13IQ<? extends ReusedUIContentAssem<?>>> LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(Top1NimbleCardAssem.class, "nimbleCardUIVM", "getNimbleCardUIVM()Lcom/ss/android/ugc/aweme/nimblecard/NimbleCardUIVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZ = new C685160QuA();
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Map<String, Object> KD2() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ez1;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final void Sg1(List list, AwS376S0200000_10 awS376S0200000_10) {
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final void jE1(String str) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C01V8.LIZ((C01V8) this.LLJLIL.getValue(), "inflate_cost", null, new AwS554S0100000_10(this, 609), 2);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final NimbleCardUIVM mH0() {
        return (NimbleCardUIVM) this.LLJLILLLLZIIL.getValue(this, LLJZIJLIL[0]);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final Object uv2() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            return c724270Sb3.LL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Map<String, String> G7() {
        ITop1MobAbility iTop1MobAbility = (ITop1MobAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITop1MobAbility.class, null);
        if (iTop1MobAbility != null) {
            return iTop1MobAbility.LLLFZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Map<String, Object> Zo0() {
        return C2097608Jq.LJ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), INimbleContainerAbility.class, null);
        C1558520qew.LJIIJJI(C1558520qew.LJIIL(this), INimbleModelAbility.class, null);
        NimbleTemplateContext nimbleTemplateContext = this.LLJLL;
        if (nimbleTemplateContext != null) {
            nimbleTemplateContext.LIZLLL();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, INimbleContainerAbility.class, null, null);
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, INimbleModelAbility.class, null, null);
    }

    public Top1NimbleCardAssem(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NimbleCardUIVM.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 611), null, AFwS241S0000000_10.get$arr$(282));
        this.LLJLLIL = new ArrayList();
        this.LLJLLL = new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final C14NX Bs1(C19719912Dl c19719912Dl) {
        Map<C14NX, C13IQ<? extends ReusedUISlotAssem<?>>> map;
        Set setEntrySet;
        Object next;
        NimbleTemplateContext nimbleTemplateContext = this.LLJLL;
        if (nimbleTemplateContext == null || (map = nimbleTemplateContext.LLJILJIL) == null || (setEntrySet = ((LinkedHashMap) map).entrySet()) == null) {
            return null;
        }
        Iterator it2 = setEntrySet.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((Map.Entry) next).getValue(), c19719912Dl)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (C14NX) entry.getKey();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Boolean Yw1(Map<String, ? extends Object> map) {
        Set<Map.Entry<String, ? extends Object>> setEntrySet;
        String string;
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                Pair pair = new Pair(key, string);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((String) entry2.getKey()).length() > 0) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (!linkedHashMap2.isEmpty()) {
                C651970Phj.LLILLL.getClass();
                C651980Phk.LJFF(linkedHashMap2, false);
                return Boolean.TRUE;
            }
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C01V8.LIZ((C01V8) this.LLJLIL.getValue(), null, linkedHashMap, new AwS254S0300000_10(this, (Top1NimbleCardAssem) view, (View) linkedHashMap, (Map<String, Object>) 9), 1);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C684930Qtn c684930Qtn) {
        Map<String, String> mapLLLFZ;
        C684930Qtn c684930Qtn2 = c684930Qtn;
        ITop1MobAbility iTop1MobAbility = (ITop1MobAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITop1MobAbility.class, null);
        if (iTop1MobAbility != null) {
            mapLLLFZ = iTop1MobAbility.LLLFZ();
        } else {
            mapLLLFZ = null;
        }
        if (mapLLLFZ != null && !mapLLLFZ.isEmpty()) {
            Map<String, Object> data = c684930Qtn2.getData();
            if (C19719512Dh.LJII(data) && data != null) {
                data.put("client_common_param", mapLLLFZ);
            }
        }
        NimbleTemplateContext nimbleTemplateContext = this.LLJLL;
        if (nimbleTemplateContext != null) {
            nimbleTemplateContext.LIZIZ(c684930Qtn2.getData(), null, true);
        }
        C723830SaL.LIZ(this, null, new C685180QuC(this));
    }

    public final void sp(NimbleTemplateContext nimbleTemplateContext) {
        View view;
        ViewGroup viewGroup;
        nimbleTemplateContext.LIZ(C1558520qew.LJIIL(this));
        C14NX c14nx = nimbleTemplateContext.LLJIJIL;
        if (c14nx != null && (view = c14nx.getView()) != null) {
            if (((Boolean) C079J.LIZ.getValue()).booleanValue()) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                } else {
                    layoutParams = null;
                }
                C786410Ut5.W5(view, layoutParams);
            }
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
                viewGroup.addView(view);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C684930Qtn c684930Qtn) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C684930Qtn c684930Qtn) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
