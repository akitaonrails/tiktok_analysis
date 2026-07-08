package com.ss.android.ugc.aweme.portrait.tab;

import X.C01GW;
import X.C05P0;
import X.C0DXR;
import X.C0MGI;
import X.C0MGR;
import X.C0MGU;
import X.C0MGX;
import X.C0MX0;
import X.C0MXE;
import X.C13D2;
import X.C13ZC;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1669670tYD;
import X.C1680510tph;
import X.C1685720ty6;
import X.C16GX;
import X.C19719212De;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C20084413iE;
import X.C21543519Sv;
import X.C23250099c;
import X.C316330Cad;
import X.C452501pT;
import X.C546890Lcd;
import X.C547580Ldk;
import X.C557120Lt8;
import X.C569820MWm;
import X.C569870MWr;
import X.C786410Ut5;
import X.EnumC1427810nG7;
import X.EnumC550780Liu;
import X.InterfaceC1324370kZH;
import X.InterfaceC1665500tRU;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import Y.ARunnableS77S0200000_8;
import Y.AsS35S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitConsumptionModel;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS10S0211000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitTabFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjOzshHELIOSKSw4ZzsyKmsNAB88OjE+KCYnHCQuDz0yLygpJzs=";
    public C0MGI LL;
    public AwS552S0100000_8 LLILLJJLI;
    public final C01GW LLILLL;
    public RecyclerView LLILZ;
    public View LLILZIL;
    public ComposeView LLILZLL;
    public ComposeView LLIZ;
    public C16GX LLIZLLLIL;
    public C21543519Sv LLJ;
    public C0MX0 LLJI;
    public C569870MWr LLJIJIL;
    public final C05P0<Boolean> LLJILJIL;
    public List<PortraitStyleItem> LLJILJILJ;
    public boolean LLJILLL;
    public AIGCEntranceInfo LLJJ;
    public AIPortraitConsumptionModel LLJJI;
    public String LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    public final void OR() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.remove("from_cameo_created_continue");
        }
        AIGCEntranceInfo aIGCEntranceInfo = this.LLJJ;
        if (aIGCEntranceInfo != null) {
            this.LLJJ = AIGCEntranceInfo.LIZ(aIGCEntranceInfo, null, null, 0, null, null, false, false, false, AIGC.AICreationSceneName.CAMEO_CREATED_CONTINUE.INSTANCE, AIGC.RefPageName.FaceSoundVerify.INSTANCE, null, null, null, null, false, false, 1047039);
            PR().LLIZ = this.LLJJ;
        }
    }

    public final AIPortraitTabViewModel PR() {
        return (AIPortraitTabViewModel) this.LLILLL.getValue();
    }

    public final void RR() {
        LinearLayoutManager linearLayoutManager;
        int itemCount;
        RecyclerView recyclerView = this.LLILZ;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        C0MX0 c0mx0 = this.LLJI;
        if (c0mx0 == null || (itemCount = c0mx0.getItemCount()) == 0 || linearLayoutManager.findLastVisibleItemPosition() < itemCount - 4) {
            return;
        }
        AIPortraitTabViewModel aIPortraitTabViewModelPR = PR();
        C569820MWm c569820MWm = (C569820MWm) aIPortraitTabViewModelPR.LLJIJIL.getValue();
        if (c569820MWm.LJ || !c569820MWm.LJFF) {
            return;
        }
        Integer num = c569820MWm.LJI;
        int iIntValue = num != null ? num.intValue() : 0;
        aIPortraitTabViewModelPR.LLJI.setValue(C569820MWm.LIZ(c569820MWm, null, null, true, false, null, 239));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aIPortraitTabViewModelPR), null, null, new C316330Cad(aIPortraitTabViewModelPR, iIntValue, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C16GX c16gx;
        C569870MWr c569870MWr = this.LLJIJIL;
        if (c569870MWr != null && (c16gx = this.LLIZLLLIL) != null) {
            c16gx.LIZLLL(c569870MWr);
        }
        this.LLJIJIL = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLILZIL = null;
        this.LLILZ = null;
        this.LLJI = null;
        super.onDestroyView();
    }

    public AIPortraitTabFragment() {
        super(R.layout.n8);
        this.LLILLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(107));
        this.LLJILJIL = C20028913Yh.LJI(Boolean.FALSE);
        this.LLJJIII = UUID.randomUUID().toString();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("from_cameo_created_continue")) {
            OR();
        }
        if (PR().LLJ == null) {
            PR().LLJ = EnumC550780Liu.ENTER;
            return;
        }
        if (PR().LLJ == EnumC550780Liu.ENTER) {
            PR().LLJ = EnumC550780Liu.RESUME;
            final C0MX0 c0mx0 = this.LLJI;
            if (c0mx0 != null) {
                ((LinkedHashMap) c0mx0.LLILZIL).forEach(new BiConsumer() { // from class: X.0MWs
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        c0mx0.LLILZIL.put(obj, Boolean.FALSE);
                    }
                });
            }
            RecyclerView recyclerView = this.LLILZ;
            if (recyclerView != null) {
                HandlerHook.viewPost(recyclerView, new ARunnableS77S0200000_8(recyclerView, this, 5));
            }
        }
    }

    public final void SR(PortraitStyleItem portraitStyleItem, boolean z) {
        AIGCEntranceInfo aIGCEntranceInfoLIZ;
        Context context = getContext();
        if (context == null) {
            return;
        }
        String strLIZIZ = ((C569820MWm) PR().LLJIJIL.getValue()).LIZIZ();
        String strLIZJ = ((C569820MWm) PR().LLJIJIL.getValue()).LIZJ();
        String str = this.LLJJIII;
        AIGCEntranceInfo aIGCEntranceInfoYQ2 = PR().yQ2();
        if (aIGCEntranceInfoYQ2 != null) {
            aIGCEntranceInfoLIZ = AIGCEntranceInfo.LIZ(aIGCEntranceInfoYQ2, null, null, 0, null, null, false, false, false, null, AIGC.RefPageName.AICreationSubPage.INSTANCE, null, null, null, null, false, false, 1047551);
        } else {
            aIGCEntranceInfoLIZ = null;
        }
        AIPortraitEnterParams aIPortraitEnterParams = new AIPortraitEnterParams(strLIZIZ, strLIZJ, str, aIGCEntranceInfoLIZ, this.LLJJI, z, portraitStyleItem, null);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//ai_portrait/customize");
        smartRouteBuildRoute.withParam(aIPortraitEnterParams.LIZIZ());
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.0MWr, X.0kZH] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final C21543519Sv c21543519Sv;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJJIJI = arguments.getBoolean("is_from_editor_tab", false);
            AIPortraitEnterParams.Companion.getClass();
            AIPortraitEnterParams aIPortraitEnterParamsLIZ = C557120Lt8.LIZ(arguments);
            AIGCEntranceInfo aIGCEntranceInfo = aIPortraitEnterParamsLIZ.entranceInfo;
            if (aIGCEntranceInfo == null) {
                aIGCEntranceInfo = this.LLJJ;
            }
            this.LLJJ = aIGCEntranceInfo;
            AIPortraitConsumptionModel aIPortraitConsumptionModel = aIPortraitEnterParamsLIZ.consumptionModel;
            if (aIPortraitConsumptionModel == null) {
                aIPortraitConsumptionModel = this.LLJJI;
            }
            this.LLJJI = aIPortraitConsumptionModel;
            String str = aIPortraitEnterParamsLIZ.creationId;
            if (str == null) {
                str = this.LLJJIII;
            }
            this.LLJJIII = str;
        }
        PR().LLIZ = this.LLJJ;
        PR().LLIZLLLIL = this.LLJJIII;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("from_cameo_created_continue")) {
            OR();
        }
        this.LLILZ = (RecyclerView) view.findViewById(R.id.aqn);
        this.LLILZIL = view.findViewById(R.id.aq7);
        this.LLILZLL = (ComposeView) view.findViewById(R.id.aps);
        this.LLIZ = (ComposeView) view.findViewById(R.id.aq6);
        this.LLIZLLLIL = (C16GX) view.findViewById(R.id.apr);
        this.LLJ = (C21543519Sv) view.findViewById(R.id.apv);
        C786410Ut5.I7(new AkS80S0100000_8(this, 40), view.findViewById(R.id.apt));
        ComposeView composeView = this.LLIZ;
        if (composeView != null) {
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Dark, new C19719212De(-1055802918, new AwS622S0100000_8(this, 53), true));
        }
        ComposeView composeView2 = this.LLILZLL;
        if (composeView2 != null) {
            C1669670tYD.LJ(composeView2, EnumC1427810nG7.Dark, new C19719212De(-949321263, new AwS622S0100000_8(this, 54), true));
        }
        C16GX c16gx = this.LLIZLLLIL;
        if (c16gx != 0 && (c21543519Sv = this.LLJ) != null) {
            C569870MWr c569870MWr = this.LLJIJIL;
            if (c569870MWr != null) {
                c16gx.LIZLLL(c569870MWr);
            }
            ?? r1 = new InterfaceC1324370kZH() { // from class: X.0MWr
                @Override // X.InterfaceC1324380kZI
                public final void LLZZJLIL(C16GX c16gx2, int i) {
                    boolean z;
                    if (c16gx2.getHeight() + i <= c21543519Sv.getScrimVisibleHeightTrigger()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (((Boolean) ((C13FE) this.LLJILJIL).getValue()).booleanValue() == z) {
                        return;
                    }
                    ((C13FE) this.LLJILJIL).setValue(Boolean.valueOf(z));
                }
            };
            this.LLJIJIL = r1;
            c16gx.LIZ(r1);
            r1.LLZZJLIL(c16gx, c16gx.getTop());
        }
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView != null) {
            C0MX0 c0mx0 = new C0MX0(new AwS587S0100000_8(this, 87), new AwS587S0100000_8(this, 88), new AwS622S0100000_8(this, 55));
            this.LLJI = c0mx0;
            recyclerView.setAdapter(c0mx0);
            recyclerView.setLayoutManager(new AIPortraitGridLayoutManager(recyclerView.getContext(), this.LLJI));
            recyclerView.addItemDecoration(new C0DXR() { // from class: X.0DWi
                public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));

                /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
                @Override // X.C0DXR
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(android.graphics.Rect r5, android.view.View r6, androidx.recyclerview.widget.RecyclerView r7, X.C21673919s1 r8) {
                    /*
                        r4 = this;
                        int r3 = r7.getChildAdapterPosition(r6)
                        if (r3 >= 0) goto L7
                        return
                    L7:
                        android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
                        boolean r0 = r1 instanceof X.C21681919tJ
                        if (r0 == 0) goto L30
                        X.19tJ r1 = (X.C21681919tJ) r1
                        if (r1 == 0) goto L31
                        int r2 = r1.LL
                    L15:
                        r0 = 1
                        if (r1 == 0) goto L2e
                        int r1 = r1.LLILLJJLI
                    L1a:
                        if (r3 > r0) goto L20
                        int r0 = r4.LL
                        r5.top = r0
                    L20:
                        int r0 = r4.LLILLL
                        r5.bottom = r0
                        r0 = 2
                        if (r1 < r0) goto L33
                        int r0 = r4.LL
                        r5.left = r0
                        r5.right = r0
                        return
                    L2e:
                        r1 = 1
                        goto L1a
                    L30:
                        r1 = 0
                    L31:
                        r2 = 0
                        goto L15
                    L33:
                        if (r2 != 0) goto L3e
                        int r0 = r4.LL
                        r5.left = r0
                        int r0 = r4.LLILLJJLI
                        r5.right = r0
                        return
                    L3e:
                        int r0 = r4.LLILLJJLI
                        r5.left = r0
                        int r0 = r4.LL
                        r5.right = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C340460DWi.LIZIZ(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.19s1):void");
                }
            });
            recyclerView.addOnScrollListener(new AsS35S0100000_8(this, 5));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0MGR(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0MGU(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0MGX(this, null), 3);
        Calendar calendar = Calendar.getInstance();
        int i = (calendar.get(1) * 10000) + ((calendar.get(2) + 1) * 100) + calendar.get(5);
        C01GW c01gw = C547580Ldk.LIZ;
        if (((Keva) c01gw.getValue()).getInt("last_async_request_quota_refresh_date_id", 0) != i) {
            ((Keva) c01gw.getValue()).storeInt("last_async_request_quota_refresh_date_id", i);
            C546890Lcd.LIZ.getClass();
            C546890Lcd.LIZIZ().LJFF(Source.AI_PORTRAIT, null);
        }
    }

    public final void MR(InterfaceC1665500tRU<PortraitStyleItem> interfaceC1665500tRU, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(216412561);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1665500tRU)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c.LJI(InterfaceC1685750ty9.LIZ, 370), 1.0f);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AFwS239S0000000_8.get$arr$(57);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                c13zcLJIIJ.LJJJJL(false);
                C20084413iE.LIZ(54, 4, c13zcLJIIJ, c.LIZJ, (Function1) objLJJ, null);
                NR(interfaceC1665500tRU, z, c13zcLJIIJ, (i2 & 896) | (i2 & 14) | (i2 & 112));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS10S0211000_8(this, interfaceC1665500tRU, z, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NR(X.InterfaceC1665500tRU<com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem> r22, boolean r23, X.InterfaceC1680500tpg r24, int r25) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment.NR(X.0tRU, boolean, X.0tpg, int):void");
    }
}
