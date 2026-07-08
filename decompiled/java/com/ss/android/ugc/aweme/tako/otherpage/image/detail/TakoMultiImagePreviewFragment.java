package com.ss.android.ugc.aweme.tako.otherpage.image.detail;

import X.AbstractC2361009My;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C099R;
import X.C0QSJ;
import X.C1202330hOR;
import X.C1202340hOS;
import X.C12FK;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1845270y7R;
import X.C1862330yYx;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1146704e9;
import X.InterfaceC1360805Ug;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC737790Swr;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC836760Ws6
public final class TakoMultiImagePreviewFragment extends SAFTikTokFragment implements InterfaceC1360805Ug, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jKSIpZyY+HELIOSKSIpZys2PCQlJWEHKS4jBDo/PCwFJC40LRU+LDk6LTIKOy40JSAiPQ==";
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.navArg(this, AFwS190S0000000_4.get$arr$(2047));
    public final AssemVMLazy LLJJ;
    public final C01GW LLJJI;
    public InterfaceC1360805Ug LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoMultiImagePreviewFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/tako/otherpage/image/detail/assem/TakoContentPreviewViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TakoMultiImagePreviewScope.class}).unbindAbility(this, InterfaceC1360805Ug.class);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1360805Ug.class) {
            this.LLJJIII = (InterfaceC1360805Ug) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoMultiImagePreviewScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1360805Ug.class) {
            return this.LLJJIII;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoMultiImagePreviewScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoMultiImagePreviewScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TakoMultiImagePreviewScope.class}).bindAbility(this, InterfaceC1360805Ug.class);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1360805Ug.class) {
            this.LLJJIII = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public TakoMultiImagePreviewFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoContentPreviewViewModel.class);
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c19719912DlLIZ, 269);
        AFwS232S0000000_4 aFwS232S0000000_4 = AFwS232S0000000_4.get$arr$(87);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 270), aFwS232S0000000_4, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new AwS548S0100000_4((Fragment) this, 271), aFwS232S0000000_4, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 272), aFwS232S0000000_4, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJ = assemVMLazy;
        this.LLJJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE));
        aS(AFwS232S0000000_4.get$arr$(86));
    }

    public final TakoMultiImagePreviewNavParam hS() {
        return (TakoMultiImagePreviewNavParam) this.LLJILLL.getValue();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        IScreenshotService iScreenshotService = (IScreenshotService) this.LLJJI.getValue();
        if (iScreenshotService != null) {
            iScreenshotService.LIZJ(null);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        ((TakoContentPreviewViewModel) assemVMLazy.getValue()).Lk0(hS().getItems(), hS().getOpenIndex(), hS().getMsgId(), hS().isAIGC(), hS().getHashTags(), hS().getCommonParams(), "ai_drawing", hS().getBypassImg2Video(), hS().getSkipEnterAnimation());
        final Map<String, String> commonParams = hS().getCommonParams();
        IScreenshotService iScreenshotService = (IScreenshotService) this.LLJJI.getValue();
        if (iScreenshotService != null) {
            String str = commonParams.get("message_id");
            if (str == null) {
                str = "";
            }
            iScreenshotService.LJI(str, new AbstractC2361009My() { // from class: X.0DQE
                @Override // X.AbstractC2361009My
                public final Map<String, String> mobExtraParams() {
                    Pair[] pairArr = new Pair[6];
                    String str2 = commonParams.get("enter_from");
                    if (str2 == null) {
                        str2 = "";
                    }
                    pairArr[0] = new Pair("enter_from", str2);
                    String str3 = commonParams.get("enter_method");
                    if (str3 == null) {
                        str3 = "";
                    }
                    pairArr[1] = new Pair("enter_method", str3);
                    String str4 = commonParams.get("process_id");
                    if (str4 == null) {
                        str4 = "";
                    }
                    pairArr[2] = new Pair("process_id", str4);
                    String str5 = commonParams.get("tako_session_id");
                    if (str5 == null) {
                        str5 = "";
                    }
                    pairArr[3] = new Pair("tako_session_id", str5);
                    String str6 = commonParams.get("tako_chat_id");
                    if (str6 == null) {
                        str6 = "";
                    }
                    pairArr[4] = new Pair("tako_chat_id", str6);
                    String str7 = commonParams.get("message_id");
                    pairArr[5] = new Pair("message_id", str7 != null ? str7 : "");
                    return C2097608Jq.LJIIIIZZ(pairArr);
                }
            });
        }
    }

    @Override // X.InterfaceC1360805Ug
    public final void i5() {
        finish();
    }

    @Override // X.InterfaceC1360805Ug
    public final Unit Xc(C1845270y7R c1845270y7R) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1360805Ug
    public final void nG(String str) {
        C1862330yYx.LJLJJL(C1862330yYx.LIZ, hS().getCommonParams(), str, "ai_drawing", null, hS().getMsgId(), null, 104);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C687700QyG.LJI(this);
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC1360805Ug
    public final Unit zq(C1845270y7R c1845270y7R) {
        return Unit.LIZ;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS370S0200000_4(view, this, 30), 3);
        C1202330hOR c1202330hOR = new C1202330hOR(false, 3);
        c1202330hOR.LIZJ = true;
        c1202330hOR.LJI = R.attr.z_;
        C1202340hOS.LIZJ(C1202340hOS.LIZ(this, c1202330hOR, false, true), c1202330hOR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116 A[Catch: all -> 0x01ad, TryCatch #4 {all -> 0x01ad, blocks: (B:50:0x0102, B:52:0x0116, B:62:0x014c, B:45:0x00d7, B:47:0x00fc), top: B:86:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c A[Catch: all -> 0x01ad, TRY_ENTER, TryCatch #4 {all -> 0x01ad, blocks: (B:50:0x0102, B:52:0x0116, B:62:0x014c, B:45:0x00d7, B:47:0x00fc), top: B:86:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.graphics.Bitmap] */
    @Override // X.InterfaceC1360805Ug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object qf(com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem.Image r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoMultiImagePreviewFragment.qf(com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem$Image, X.05Vn):java.lang.Object");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.frp, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC1360805Ug
    public final Object sD(List<String> list, String str, Map<String, String> map, boolean z, List<String> list2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        View view = getView();
        if (view == null) {
            return Unit.LIZ;
        }
        Object objLIZIZ = C12FK.LIZIZ(view, list, hS().getMsgId(), hS().getCommonParams(), hS().isAIGC(), hS().getHashTags(), interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }
}
