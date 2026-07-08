package com.ss.android.ugc.aweme.minis.page.main.fragment;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C098200Yq;
import X.C1110404Vy;
import X.C11S5;
import X.C1227904rF;
import X.C1266080j3G;
import X.C1308910kAL;
import X.C1366200lek;
import X.C1367300lgW;
import X.C1369870lkf;
import X.C1371590lnR;
import X.C1378700lyu;
import X.C1378790lz3;
import X.C1378820lz6;
import X.C13LP;
import X.C14KI;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20742216Eq;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2196211AxP;
import X.C2196951Ayb;
import X.C2197221Az2;
import X.C2211751BhN;
import X.C259800zU;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1236720iHu;
import X.InterfaceC1352000lHq;
import X.InterfaceC1356400lOw;
import X.InterfaceC1363000lZa;
import X.InterfaceC1366280les;
import X.InterfaceC1378810lz5;
import X.InterfaceC1487280oo2;
import Y.AAListenerS332S0100000_21;
import Y.ARunnableS27S0201000_21;
import Y.ARunnableS40S0110000_21;
import Y.ARunnableS7S0202000_21;
import Y.AkS326S0200000_19;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import com.ss.android.ugc.aweme.minis.request.IMetaServiceApi;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareSheetPanelFragment extends BaseFragment implements InterfaceC1363000lZa, InterfaceC1352000lHq {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjUtLip9JSHELIOSQlJ2E1OiQrJCo9PGsfIS4hLRYkLConGCQiLCMVOiQrJCo9PA==";
    public C1367300lgW LLIZ;
    public RecyclerView LLIZLLLIL;
    public LinearLayout LLJ;
    public C1371590lnR LLJI;
    public TuxSheet LLJIJIL;
    public View LLJILJILJ;
    public InterfaceC1366280les LLJILLL;
    public FrameLayout LLJJ;
    public C20742216Eq LLJJI;
    public C1378700lyu LLJJIII;
    public C1378790lz3 LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJJ;
    public boolean LLJILJIL = true;
    public final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(16.5d)));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 693));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 694));
    public int LLJJJJJIL = -1;

    @Override // X.InterfaceC1352000lHq
    public final void LLLLZI(int i) {
    }

    @Override // X.InterfaceC1363000lZa
    public final void h(boolean z) {
    }

    public final int UR() {
        C19ME c19me;
        C20742216Eq c20742216Eq = this.LLJJI;
        ViewGroup.LayoutParams layoutParams = c20742216Eq != null ? c20742216Eq.getLayoutParams() : null;
        if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
            return 0;
        }
        return c19me.guideEnd;
    }

    @Override // X.InterfaceC1363000lZa
    public final void sd() {
        C1366200lek c1366200lek;
        InterfaceC1356400lOw interfaceC1356400lOw;
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView == null || (c1366200lek = (C1366200lek) recyclerView.findViewById(R.id.olj)) == null || (interfaceC1356400lOw = c1366200lek.LL) == null) {
            return;
        }
        interfaceC1356400lOw.refresh();
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLILII() {
        LinearLayout linearLayout;
        Context context;
        Integer numLIZJ;
        TuxTextView tuxTextView;
        LinearLayout linearLayout2;
        View viewFindViewById;
        SmartImageView smartImageView;
        int iUR = UR();
        if (iUR == 0) {
            return;
        }
        RecyclerView recyclerView = this.LLIZLLLIL;
        C1366200lek c1366200lek = recyclerView != null ? (C1366200lek) recyclerView.findViewById(R.id.olj) : null;
        LinearLayout linearLayout3 = this.LLJ;
        View viewFindViewById2 = linearLayout3 != null ? linearLayout3.findViewById(R.id.ofm) : null;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        }
        LinearLayout linearLayout4 = this.LLJ;
        if (linearLayout4 != null && (smartImageView = (SmartImageView) linearLayout4.findViewById(R.id.ofk)) != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
        LinearLayout linearLayout5 = this.LLJ;
        if (linearLayout5 != null && (viewFindViewById = linearLayout5.findViewById(R.id.ofl)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        LinearLayout linearLayout6 = this.LLJ;
        if (linearLayout6 != null && (linearLayout2 = (LinearLayout) linearLayout6.findViewById(R.id.of8)) != null) {
            C786410Ut5.LJZL(0, linearLayout2);
        }
        LinearLayout linearLayout7 = this.LLJ;
        if (linearLayout7 != null && (tuxTextView = (TuxTextView) linearLayout7.findViewById(R.id.y30)) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        LinearLayout linearLayout8 = this.LLJ;
        if (linearLayout8 != null && (context = linearLayout8.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1c, context)) != null) {
            linearLayout8.setBackgroundColor(numLIZJ.intValue());
        }
        LinearLayout linearLayout9 = this.LLJ;
        if (linearLayout9 == null || linearLayout9.getParent() == null || (linearLayout = this.LLJ) == null) {
            return;
        }
        HandlerHook.viewPost(linearLayout, new ARunnableS27S0201000_21(iUR, c1366200lek, this, 6));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView != null) {
            C2211751BhN.LIZIZ(recyclerView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void VR(X.C1378790lz3 r5) {
        /*
            r4 = this;
            X.0lyu r0 = r4.LLJJIII
            r3 = 0
            if (r0 == 0) goto L52
            X.0lz5 r0 = r0.LJFF
            if (r0 == 0) goto L52
            java.lang.String r1 = r0.BQ()
        Ld:
            X.1AxP r0 = new X.1AxP
            r0.<init>()
            X.0lyu r0 = r4.LLJJIII
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel r0 = r0.LIZJ
        L18:
            boolean r0 = X.C2196211AxP.LIZLLL(r0, r1)
            if (r0 == 0) goto L24
            X.0lyu r0 = r4.LLJJIII
            r4.aS(r0, r5)
        L23:
            return
        L24:
            if (r5 == 0) goto L54
            java.lang.String r0 = r5.LIZJ
            if (r0 == 0) goto L54
            boolean r0 = r4.LLJJIJIIJIL
            if (r0 == 0) goto L54
            X.0lnR r2 = r4.LLJI
            if (r2 == 0) goto L23
            androidx.recyclerview.widget.RecyclerView r1 = r4.LLIZLLLIL
            if (r1 == 0) goto L48
            r0 = 2131381952(0x7f0a4ec0, float:1.8384236E38)
            android.view.View r1 = r1.findViewById(r0)
            X.0lek r1 = (X.C1366200lek) r1
            if (r1 == 0) goto L48
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r0 = r2.LJIJJ
            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = (com.ss.android.ugc.aweme.sharer.model.SharePackage) r0
            r1.setSharePackage(r0)
        L48:
            X.0les r0 = r4.LLJILLL
            if (r0 == 0) goto L23
            r0.LIZIZ(r2)
            return
        L50:
            r0 = r3
            goto L18
        L52:
            r1 = r3
            goto Ld
        L54:
            X.0lyu r0 = r4.LLJJIII
            if (r0 == 0) goto L71
            X.0qEB r2 = r0.LJ
            X.0lz5 r0 = r0.LJFF
            if (r0 == 0) goto L72
            java.lang.String r1 = r0.BQ()
        L62:
            X.0lyu r0 = r4.LLJJIII
            if (r0 == 0) goto L68
            com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel r3 = r0.LIZJ
        L68:
            X.0lyw r0 = new X.0lyw
            r0.<init>()
            X.C1383140m64.LIZIZ(r2, r1, r3, r0)
            return
        L71:
            r2 = r3
        L72:
            r1 = r3
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment.VR(X.0lz3):void");
    }

    public final void ZR(boolean z) {
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        int measuredHeight4;
        int measuredHeight5;
        int i;
        int iLIZIZ;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        int iUR = UR();
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView != null && (viewFindViewById4 = recyclerView.findViewById(R.id.olj)) != null) {
            measuredHeight = viewFindViewById4.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        RecyclerView recyclerView2 = this.LLIZLLLIL;
        if (recyclerView2 != null && (viewFindViewById3 = recyclerView2.findViewById(R.id.ogn)) != null) {
            measuredHeight2 = viewFindViewById3.getMeasuredHeight();
        } else {
            measuredHeight2 = 0;
        }
        LinearLayout linearLayout = this.LLJ;
        if (linearLayout != null && (viewFindViewById2 = linearLayout.findViewById(R.id.ofm)) != null) {
            measuredHeight3 = viewFindViewById2.getMeasuredHeight();
        } else {
            measuredHeight3 = 0;
        }
        FrameLayout frameLayout = this.LLJJ;
        if (frameLayout != null) {
            measuredHeight4 = frameLayout.getMeasuredHeight();
        } else {
            measuredHeight4 = 0;
        }
        RecyclerView recyclerView3 = this.LLIZLLLIL;
        if (recyclerView3 != null && (viewFindViewById = recyclerView3.findViewById(R.id.p1i)) != null) {
            measuredHeight5 = viewFindViewById.getMeasuredHeight();
        } else {
            measuredHeight5 = 0;
        }
        int i2 = this.LLJJIJIL;
        int i3 = iUR + measuredHeight + measuredHeight5 + measuredHeight3 + i2;
        if (z) {
            int i4 = measuredHeight4 + i3;
            if (this.LLJJJ) {
                iLIZIZ = i2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            }
            i = i4 - iLIZIZ;
        } else {
            i = measuredHeight2 + i3;
        }
        View view = this.LLJILJILJ;
        if (view != null) {
            WR(i, view);
        }
    }

    @Override // X.InterfaceC1363000lZa
    public final void gF(boolean z) {
        View viewFindViewById;
        FrameLayout frameLayout;
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView != null) {
            viewFindViewById = recyclerView.findViewById(R.id.ogn);
        } else {
            viewFindViewById = null;
        }
        int i = 0;
        if (z) {
            if (viewFindViewById != null) {
                int visibility = viewFindViewById.getVisibility();
                viewFindViewById.setVisibility(4);
                C1602160rnK.LIZIZ(visibility, 4, viewFindViewById);
            }
        } else if (viewFindViewById != null) {
            int visibility2 = viewFindViewById.getVisibility();
            viewFindViewById.setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, viewFindViewById);
        }
        FrameLayout frameLayout2 = this.LLJJ;
        if (frameLayout2 != null) {
            if (!z) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, frameLayout2);
        }
        FrameLayout frameLayout3 = this.LLJJ;
        if (frameLayout3 != null && frameLayout3.getParent() != null && (frameLayout = this.LLJJ) != null) {
            HandlerHook.viewPost(frameLayout, new ARunnableS40S0110000_21(this, z, 0));
        }
    }

    @Override // X.InterfaceC1352000lHq
    public final void j(int i) {
        int iUR;
        int iLIZIZ;
        C1366200lek c1366200lek;
        View viewFindViewById;
        LinearLayout linearLayout;
        Context context;
        Integer numLIZJ;
        LinearLayout linearLayout2;
        View viewFindViewById2;
        SmartImageView smartImageView;
        Context context2 = getContext();
        if (context2 == null || (iUR = UR()) == (iLIZIZ = i - C14KI.LIZIZ(context2))) {
            return;
        }
        RecyclerView recyclerView = this.LLIZLLLIL;
        TuxTextView tuxTextView = null;
        if (recyclerView != null) {
            c1366200lek = (C1366200lek) recyclerView.findViewById(R.id.olj);
        } else {
            c1366200lek = null;
        }
        LinearLayout linearLayout3 = this.LLJ;
        if (linearLayout3 != null) {
            viewFindViewById = linearLayout3.findViewById(R.id.ofm);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        }
        LinearLayout linearLayout4 = this.LLJ;
        if (linearLayout4 != null && (smartImageView = (SmartImageView) linearLayout4.findViewById(R.id.ofk)) != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
        LinearLayout linearLayout5 = this.LLJ;
        if (linearLayout5 != null && (viewFindViewById2 = linearLayout5.findViewById(R.id.ofl)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        LinearLayout linearLayout6 = this.LLJ;
        if (linearLayout6 != null && (linearLayout2 = (LinearLayout) linearLayout6.findViewById(R.id.of8)) != null) {
            C786410Ut5.LJZL(8, linearLayout2);
        }
        LinearLayout linearLayout7 = this.LLJ;
        if (linearLayout7 != null) {
            tuxTextView = (TuxTextView) linearLayout7.findViewById(R.id.y30);
        }
        LinearLayout linearLayout8 = this.LLJ;
        if (linearLayout8 != null && (context = linearLayout8.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context)) != null) {
            linearLayout8.setBackgroundColor(numLIZJ.intValue());
        }
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.LJJJJI(14.0f);
        }
        LinearLayout linearLayout9 = this.LLJ;
        if (linearLayout9 != null && linearLayout9.getParent() != null && (linearLayout = this.LLJ) != null) {
            HandlerHook.viewPost(linearLayout, new ARunnableS7S0202000_21(iLIZIZ, iUR, c1366200lek, this, 1));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJII(true);
    }

    public final void WR(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public final void aS(final C1378700lyu c1378700lyu, final C1378790lz3 c1378790lz3) {
        final String strBQ;
        String strLJJLIIIJ;
        String strBQ2;
        String str;
        String str2;
        MinisMetaResp minisMetaResp;
        String str3;
        MinisMetaResp minisMetaResp2;
        String str4;
        String str5;
        Map<String, Object> map;
        Set<Map.Entry<String, Object>> setEntrySet;
        if (c1378700lyu != null) {
            InterfaceC1378810lz5 interfaceC1378810lz5 = c1378700lyu.LJFF;
            String str6 = null;
            if (interfaceC1378810lz5 != null) {
                strBQ = interfaceC1378810lz5.BQ();
            } else {
                strBQ = null;
            }
            C1378820lz6 c1378820lz6 = C1378820lz6.LIZ;
            InterfaceC1236720iHu interfaceC1236720iHu = new InterfaceC1236720iHu() { // from class: X.0lyV
                /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[PHI: r9
                  0x007b: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:30:0x0079, B:28:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[PHI: r9
                  0x0083: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String), (r9v3 java.lang.String) binds: [B:30:0x0079, B:32:0x007d, B:34:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x016f  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0195  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x01a3  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x01a6  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01b5 A[PHI: r6
                  0x01b5: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v14 java.lang.String) binds: [B:83:0x01b1, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.InterfaceC1236720iHu
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(boolean r27, com.ss.android.ugc.aweme.minis.model.NetworkResponse<com.ss.android.ugc.aweme.minis.model.ContentPbResponse> r28) {
                    /*
                        Method dump skipped, instruction units count: 475
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1378450lyV.LIZ(boolean, com.ss.android.ugc.aweme.minis.model.NetworkResponse):void");
                }
            };
            c1378820lz6.getClass();
            if (c1378790lz3 != null && (map = c1378790lz3.LIZLLL) != null && (setEntrySet = map.entrySet()) != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(setEntrySet, "&", "", "", 0, null, null, 56);
            } else {
                strLJJLIIIJ = null;
            }
            InterfaceC1378810lz5 interfaceC1378810lz52 = c1378700lyu.LJFF;
            if (interfaceC1378810lz52 != null) {
                strBQ2 = interfaceC1378810lz52.BQ();
            } else {
                strBQ2 = null;
            }
            MinisViewModel minisViewModel = c1378700lyu.LIZJ;
            if (minisViewModel != null) {
                SchemaParserData schemaParserData = c1378700lyu.LIZLLL;
                if (schemaParserData != null) {
                    str = schemaParserData.clientKey;
                } else {
                    str = null;
                }
                if (c1378790lz3 == null || (str2 = c1378790lz3.LIZ) == null) {
                    NetworkResponse<MinisMetaResp> value = minisViewModel.LLILLJJLI.getValue();
                    if (value != null && (minisMetaResp = value.data) != null) {
                        str2 = minisMetaResp.name;
                    } else {
                        str2 = null;
                    }
                }
                if (c1378790lz3 == null || (str3 = c1378790lz3.LIZIZ) == null) {
                    NetworkResponse<MinisMetaResp> value2 = c1378700lyu.LIZJ.LLILLJJLI.getValue();
                    if (value2 != null && (minisMetaResp2 = value2.data) != null) {
                        str3 = minisMetaResp2.description;
                    } else {
                        str3 = null;
                    }
                }
                if (c1378790lz3 != null) {
                    str4 = c1378790lz3.LIZJ;
                } else {
                    str4 = null;
                }
                new C2196211AxP();
                int i = !C2196211AxP.LIZLLL(c1378700lyu.LIZJ, strBQ2) ? 1 : 0;
                int i2 = C2187451AjH.LIZ;
                C2196951Ayb c2196951Ayb = minisViewModel.LL;
                c2196951Ayb.getClass();
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = new NetworkResponse(null, -1, false, null, false, null, null);
                if (str4 != null) {
                    str6 = strBQ2;
                }
                if (C2197221Az2.LIZ(str)) {
                    str5 = "mini_game";
                } else {
                    str5 = "short_drama";
                }
                LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(new Pair("minisID", str), new Pair("collectionID", str6), new Pair("minisType", str5));
                IMetaServiceApi iMetaServiceApi = c2196951Ayb.LIZIZ;
                C1227904rF.LIZ.getClass();
                AbstractC19484711Kz.LJIJJ(iMetaServiceApi.getContentPbForDMShare(str, str2, str3, strBQ2, str4, strLJJLIIIJ, C1227904rF.LJI(linkedHashMapLJII), i, 0, null)).LJIIZILJ(new AkS326S0200000_19(c2196951Ayb, c259800zU, 2)).LJJI(new InterfaceC1487280oo2() { // from class: X.01XK
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        String string;
                        Throwable th = (Throwable) obj;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchContentPbForDMShare, error occurred, cause:");
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            string = cause.toString();
                        } else {
                            string = null;
                        }
                        sbLIZ.append(string);
                        C2188811AlT.LIZIZ(sbLIZ);
                        return AbstractC19484711Kz.LJIILLIIL(th);
                    }
                }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1266080j3G(interfaceC1236720iHu, 1));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025f  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View decorView;
        Window window;
        this.LLJILJILJ = C786410Ut5.Td(layoutInflater, R.layout.c8z, viewGroup, false);
        IKeyboardService iKeyboardServiceLIZ = C1110404Vy.LIZ();
        Context context = getContext();
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = iKeyboardServiceLIZ.LIZ(context, decorView);
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = this;
        }
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.show();
        }
        View view = this.LLJILJILJ;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view;
    }

    public final void SR(int i, int i2, final int i3, final int i4, final int i5) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0lyv
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue;
                View view;
                Integer num;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                C20742216Eq c20742216Eq = this.LL.LLJJI;
                if (c20742216Eq != null) {
                    c20742216Eq.setGuidelineEnd(iIntValue);
                }
                int i6 = iIntValue + i3 + i4 + i5;
                ShareSheetPanelFragment shareSheetPanelFragment = this.LL;
                if (i6 > shareSheetPanelFragment.LLJJJJJIL && (view = shareSheetPanelFragment.LLJILJILJ) != null) {
                    shareSheetPanelFragment.WR(i6, view);
                }
            }
        });
        valueAnimatorOfInt.addListener(new AAListenerS332S0100000_21(this, 8));
        valueAnimatorOfInt.start();
    }
}
