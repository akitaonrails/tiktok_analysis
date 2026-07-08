package com.bytedance.android.livesdk.viewerwishestmp.settings;

import X.C0IJT;
import X.C0WZX;
import X.C1117370fBP;
import X.C1324720kZq;
import X.C1338790kwX;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C16FZ;
import X.C1819620xS4;
import X.C1AI0;
import X.C1AI1;
import X.C1AI2;
import X.C1AI6;
import X.C1AI9;
import X.C1AIE;
import X.C1AIG;
import X.C1AII;
import X.C1AIP;
import X.C2176881AHm;
import X.C2204961BRm;
import X.C410901il;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC774050UXz;
import X.InterfaceC1094160eZy;
import X.InterfaceC1106030et7;
import X.RunnableC781530UlD;
import Y.ARunnableS44S0101000_33;
import Y.AfS202S0100000_33;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.VWSettingsPageCloseChannel;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithStatus;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesSettingsPage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import wh6.AbS163S0110000_33;
import wh6.AbS517S0200000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ViewerWishesSettingsPage extends LiveSheetFragment implements C1AIP {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PiwpPiohPyw/ISHELIOSogPCg8Zzw2PDElJyggZhMlLDg2OhIlOic2OxYpPTs6JiI/GS40LQ==";
    public DataChannel LLJLLL;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public C1AI9 LLLF;
    public long LLLFFI;
    public long LLLFZ;
    public C1AIE LLLI;
    public SparkContext LLLII;
    public boolean LLLIIII;
    public ConstraintLayout LLLIIIIL;
    public C16F5 LLLIIIL;
    public LiveIconView LLLIIL;
    public LiveIconView LLLIILIL;
    public View LLLIL;
    public C16F5 LLLILZ;
    public C1324720kZq LLLILZJ;
    public LiveIconView LLLILZLLLI;
    public C16F5 LLLIZZ;
    public View LLLJ;
    public RunnableC781530UlD LLLJIL;
    public View LLLJL;
    public ViewerWishesVerticalCenterLayoutManager LLLL;
    public int LLLLIIIILLL;
    public C16FS LLLLIIL;
    public C16FS LLLLIILL;
    public LiveDialog LLLLIILLL;
    public C16F5 LLLLIL;
    public C16FZ LLLLILI;
    public C16F5 LLLLJ;
    public View LLLLJI;
    public View LLLLL;
    public View LLLLLIL;
    public View LLLLLILLIL;
    public C1324720kZq LLLLLJIL;
    public C16F5 LLLLLJLJLL;
    public View LLLLLL;
    public View LLLLLLIL;
    public LiveEditText LLLLLLJ;
    public RunnableC781530UlD LLLLLLL;
    public View LLLLLLLLL;
    public EnumC774050UXz LLLLLLLLLL;
    public final AwS612S0100000_33 LLLLLLLZIL;
    public boolean LLJZ = true;
    public C1AI6 LLLFF = new C1AI6(false, null, null, null, null, null, null, null, 2046);
    public final C1117370fBP LLLLII = new C1117370fBP();

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[PHI: r5
      0x003a: PHI (r5v14 java.lang.String) = (r5v0 java.lang.String), (r5v15 java.lang.String) binds: [B:12:0x0038, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[PHI: r5
      0x0042: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v14 java.lang.String), (r5v14 java.lang.String) binds: [B:12:0x0038, B:14:0x003c, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C1AIP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI() {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesSettingsPage.LJIJJLI():void");
    }

    @Override // X.C1AIP
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C1AIP
    public final void Ak() {
        C500260Jjc.LJIILIIL(this.LLLLL);
        this.LLLIIII = false;
    }

    public final void GS() {
        LiveEditText liveEditText = this.LLLLLLJ;
        if (liveEditText != null) {
            Editable editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/SM4XHvMrwuGDNvBZ8+rOzhiMoiiraWiWHHtBuR+yinlUFo/5HuVfQGL76OdURAt0g==", null));
            liveEditText.setSelection(editableLLLFZ != null ? editableLLLFZ.length() : 0);
        }
        LiveEditText liveEditText2 = this.LLLLLLJ;
        if (liveEditText2 != null) {
            liveEditText2.requestFocus();
        }
    }

    @Override // X.C1AIP
    public final void LLJJIJIIJIL() {
        C500260Jjc.LLFFF(this.LLLLJ);
        C500260Jjc.LLFFF(this.LLLLJI);
        C500260Jjc.LJIILLIIL(this.LLLLIIL);
        C500260Jjc.LJIILLIIL(this.LLLLIILL);
        C500260Jjc.LJIILIIL(this.LLLLILI);
        C1AI2 c1ai2 = new C1AI2(null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -1, 2097151);
        C1AI1.LIZ(c1ai2, this.LLJLLL, true);
        if (C1AI0.LJFF()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_loading_fail");
            c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
            c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.C1AIP
    public final void NK() {
        if (this.LLJZIJLIL) {
            zS(true);
        } else {
            this.LLL = true;
        }
    }

    public final void NS() {
        if (uS()) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131856971));
            return;
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIIL(2131756030, (int) yS(), Integer.valueOf((int) yS())));
        C1AI2 c1ai2 = new C1AI2(null, null, C1AI1.LIZIZ(this.LLLFF), null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -5, 2097151);
        C1AI1.LIZ(c1ai2, this.LLJLLL, true);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_wishes_exceed");
        c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
        c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
        c474500IjALIZ.LJJII(c1ai2.LIZJ, "entrance");
        Boolean bool = c1ai2.LJJIJIIJI;
        c474500IjALIZ.LJJII(bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null, "is_campaign_anchor");
        c474500IjALIZ.LIZ();
    }

    @Override // X.C1AIP
    public final void Oa() {
        C500260Jjc.LLFFF(this.LLLLL);
        this.LLLIIII = true;
    }

    public final void PS() {
        C1AI9 c1ai9 = this.LLLF;
        if (c1ai9 != null) {
            C410901il c410901il = new C410901il();
            List<C1AIE> listSubList = c1ai9.LJIL;
            if (listSubList != null) {
                if (listSubList.size() > yS()) {
                    listSubList = listSubList.subList(0, (int) yS());
                }
                this.LLLLIIIILLL = listSubList.size();
                for (C1AIE c1aie : listSubList) {
                    c1aie.LJIIIIZZ = C1AI1.LIZIZ(this.LLLFF);
                    c1aie.LJIIIZ = C1AI1.LIZIZ(this.LLLFF);
                    c1aie.LJIIL = C1AI1.LIZLLL(this.LLLFF);
                    c1aie.LJIILIIL = this.LLLFF.LJ;
                    c410901il.add(c1aie);
                }
                this.LLLLII.LLLI(c410901il);
            }
        }
        this.LLLLII.notifyDataSetChanged();
        if (this.LLLLIIIILLL == 0) {
            C500260Jjc.LLFFF(this.LLLJL);
        } else {
            C500260Jjc.LJIILIIL(this.LLLJL);
        }
        HS();
        wS();
        int i = this.LLLLIIIILLL;
        if (i != 0) {
            C16F5 c16f5 = this.LLLIZZ;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJJ(2131857012, Integer.valueOf(i)));
                return;
            }
            return;
        }
        C16F5 c16f52 = this.LLLIZZ;
        if (c16f52 != null) {
            c16f52.setText(C497740JfY.LJIJI(2131857013));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null) {
            dataChannel.GQ2(this, ViewerWishesStatus.class, this.LLLLLLLZIL);
        }
        super.onDestroy();
    }

    public final boolean uS() {
        C2176881AHm c2176881AHm;
        EnumC774050UXz enumC774050UXz;
        DataChannel dataChannel = this.LLJLLL;
        return (dataChannel == null || (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) == null || (enumC774050UXz = c2176881AHm.LIZ) == null || !enumC774050UXz.isInViewerWishesCreator()) ? false : true;
    }

    public final long yS() {
        Long lValueOf;
        C1AI9 c1ai9 = this.LLLF;
        if (c1ai9 == null || (lValueOf = Long.valueOf(c1ai9.LJIILIIL)) == null || lValueOf.longValue() <= 0) {
            return 6L;
        }
        return lValueOf.longValue();
    }

    public ViewerWishesSettingsPage() {
        C784440Upu.LIZ().LIZJ(this, C1AII.class).LIZJ(new AfS202S0100000_33(this, 18));
        this.LLLLLLLZIL = new AwS612S0100000_33(this, 36);
    }

    @Override // X.C1AIP
    public final void D8() {
        C766270U4b.LIZLLL(2131856984);
    }

    @Override // X.C1AIP
    public final void HO() {
        C766270U4b.LIZLLL(2131856975);
    }

    public final void HS() {
        if (uS()) {
            int i = this.LLLLIIIILLL;
            if (i != 0) {
                C16FS c16fs = this.LLLLIIL;
                if (c16fs != null) {
                    c16fs.setText(C497740JfY.LJIJJ(2131856995, Integer.valueOf(i)));
                    return;
                }
                return;
            }
            C16FS c16fs2 = this.LLLLIIL;
            if (c16fs2 != null) {
                c16fs2.setText(C497740JfY.LJIJI(2131856996));
                return;
            }
            return;
        }
        int i2 = this.LLLLIIIILLL;
        if (i2 != 0) {
            C16FS c16fs3 = this.LLLLIIL;
            if (c16fs3 != null) {
                c16fs3.setText(C497740JfY.LJIJJ(2131856990, Integer.valueOf(i2)));
                return;
            }
            return;
        }
        C16FS c16fs4 = this.LLLLIIL;
        if (c16fs4 != null) {
            c16fs4.setText(C497740JfY.LJIJI(2131857005));
        }
    }

    public final void JS() {
        if (uS() && this.LLJZIJLIL) {
            C500260Jjc.LLFFF(this.LLLLIILL);
        } else {
            C500260Jjc.LJIILIIL(this.LLLLIILL);
        }
    }

    @Override // X.C1AIP
    public final void V5() {
        C766270U4b.LIZLLL(2131857015);
    }

    @Override // X.C1AIP
    public final void lF() {
        C766270U4b.LIZLLL(2131857007);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        LiveEditText liveEditText = this.LLLLLLJ;
        if (liveEditText != null) {
            liveEditText.clearFocus();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLLIIII) {
            return;
        }
        C500260Jjc.LJIILIIL(this.LLLLL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC1094160eZy.o1.LJFF(Boolean.FALSE);
    }

    public final void wS() {
        HS();
        if (uS() || this.LLLLIIIILLL >= yS()) {
            View view = this.LLLJ;
            if (view != null) {
                C786410Ut5.T4(view, 0.3f);
            }
        } else {
            View view2 = this.LLLJ;
            if (view2 != null) {
                C786410Ut5.T4(view2, 1.0f);
            }
        }
        if (uS()) {
            View view3 = this.LLLIL;
            if (view3 != null) {
                C786410Ut5.T4(view3, 0.3f);
                return;
            }
            return;
        }
        View view4 = this.LLLIL;
        if (view4 != null) {
            C786410Ut5.T4(view4, 1.0f);
        }
    }

    @Override // X.C1AIP
    public final boolean M6() {
        return this.LLLIIII;
    }

    @Override // X.C1AIP
    public final void wG() {
        PS();
    }

    public final void BS(long j) {
        List<C1AIE> list;
        if (j == 0) {
            return;
        }
        if (j == -1) {
            LLJ(this.LLLLIIIILLL - 1);
            return;
        }
        int i = 0;
        if (j == -2) {
            LLJ(0);
            return;
        }
        C1AI9 c1ai9 = this.LLLF;
        int i2 = -1;
        if (c1ai9 != null && (list = c1ai9.LJIL) != null) {
            for (C1AIE c1aie : list) {
                int i3 = i + 1;
                if (i >= 0) {
                    if (c1aie.LIZIZ == j) {
                        i2 = i;
                    }
                    i = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        LLJ(i2);
    }

    public final void FS(boolean z) {
        if (z) {
            C500260Jjc.LLFFF(this.LLLLILI);
            C500260Jjc.LJIILIIL(this.LLLIL);
            C500260Jjc.LJIILIIL(this.LLLLIIL);
            C500260Jjc.LJIILIIL(this.LLLIZZ);
            C500260Jjc.LJIILIIL(this.LLLJ);
            C500260Jjc.LJIILIIL(this.LLLJIL);
            LiveIconView liveIconView = this.LLLIILIL;
            if (liveIconView != null) {
                C786410Ut5.i5(liveIconView, 0.3f);
            }
        } else {
            C500260Jjc.LJIILIIL(this.LLLLILI);
            C500260Jjc.LLFFF(this.LLLIL);
            C500260Jjc.LLFFF(this.LLLLIIL);
            C500260Jjc.LLFFF(this.LLLIZZ);
            C500260Jjc.LLFFF(this.LLLJ);
            C500260Jjc.LLFFF(this.LLLJIL);
            LiveIconView liveIconView2 = this.LLLIILIL;
            if (liveIconView2 != null) {
                C786410Ut5.i5(liveIconView2, 1.0f);
            }
        }
        LiveIconView liveIconView3 = this.LLLIILIL;
        if (liveIconView3 != null) {
            C786410Ut5.I7(new AbS163S0110000_33(this, z, 0), liveIconView3);
        }
    }

    @Override // X.C1AIP
    public final void KM(boolean z) {
        if (z && this.LLLLIIIILLL > 0) {
            C16FS c16fs = this.LLLLIIL;
            if (c16fs != null) {
                C786410Ut5.j5(c16fs, 1.0f);
            }
            this.LLJZ = true;
            return;
        }
        C16FS c16fs2 = this.LLLLIIL;
        if (c16fs2 != null) {
            C786410Ut5.j5(c16fs2, 0.3f);
        }
        this.LLJZ = false;
    }

    public final void LLJ(int i) {
        if (this.LLLLIIIILLL > 0 && getContext() != null) {
            int i2 = this.LLLLIIIILLL - 1;
            if (i > i2) {
                i = i2;
            }
            if (i < 0) {
                i = 0;
            }
            RunnableC781530UlD runnableC781530UlD = this.LLLJIL;
            if (runnableC781530UlD != null) {
                HandlerHook.viewPost(runnableC781530UlD, new ARunnableS44S0101000_33(i, this, 0));
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C497740JfY.LIZLLL(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.dimBehindType = 2;
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void mS(boolean z) {
        LiveEditText liveEditText;
        LiveEditText liveEditText2;
        if (!z && (liveEditText = this.LLLLLLJ) != null && liveEditText.hasFocus() && (liveEditText2 = this.LLLLLLJ) != null) {
            liveEditText2.clearFocus();
        }
    }

    @Override // X.C1AIP
    public final void w6(long j) {
        C500260Jjc.LJIILIIL(this.LLLLL);
        this.LLLIIII = false;
        PS();
        BS(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[PHI: r33
      0x008a: PHI (r33v1 java.lang.String) = (r33v0 java.lang.String), (r33v4 java.lang.String) binds: [B:30:0x0087, B:25:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zS(boolean r51) {
        /*
            r50 = this;
            if (r51 == 0) goto L9f
            java.lang.String r18 = "guidance"
        L4:
            r2 = r50
            android.content.Context r15 = r2.getContext()
            if (r15 == 0) goto L86
            X.1AI6 r0 = r2.LLLFF
            java.lang.String r17 = X.C1AI1.LIZIZ(r0)
            X.1AI9 r0 = r2.LLLF
            java.lang.String r33 = ""
            if (r0 == 0) goto L1c
            java.lang.String r10 = r0.LJIJJ
            if (r10 != 0) goto L1e
        L1c:
            r10 = r33
        L1e:
            r8 = 0
            if (r0 == 0) goto L9a
            java.util.List<com.bytedance.android.livesdk.model.Gift> r8 = r0.LJJI
            java.util.List<java.lang.Long> r14 = r0.LJJIFFI
            java.util.List<java.lang.Long> r13 = r0.LJJII
            java.util.List r24 = r0.LIZLLL()
        L2b:
            X.1AI9 r0 = r2.LLLF
            if (r0 == 0) goto L96
            boolean r1 = r0.LJIIJ
            if (r1 == 0) goto L93
            java.lang.String r27 = "music_on_stage"
        L35:
            boolean r7 = r0.LJIIJJI
        L37:
            if (r0 == 0) goto L87
            java.lang.String r1 = r0.LJIIL
            if (r1 == 0) goto L87
            r33 = r1
        L3f:
            com.bytedance.android.livesdk.viewer_picks.model.GetSettingsResponse$Data$TemplateBannerConfig r1 = r0.LJIJI
            if (r1 == 0) goto L8a
            long r5 = r1.templateId
        L45:
            long r3 = r0.LJIIZILJ
            long r0 = r0.LJIILLIIL
        L49:
            X.1AI6 r9 = r2.LLLFF
            java.lang.String r12 = r9.LJII
            java.lang.String r11 = r9.LJIIIIZZ
            java.lang.String r9 = r9.LJI
            java.util.List r48 = X.C018Z.LIZ(r9)
            java.lang.String r16 = "aweme://roma_redirect/?spark_page=viewer_wishes_templates_70"
            r19 = 0
            r25 = 0
            r34 = 0
            r49 = 9921552(0x976410, float:1.3903056E-38)
            r29 = r25
            r31 = r25
            r35 = r19
            r36 = r19
            r37 = r0
            r39 = r25
            r41 = r5
            r43 = r3
            r45 = r34
            r46 = r12
            r47 = r11
            r21 = r8
            r22 = r14
            r23 = r13
            r28 = r7
            r20 = r10
            com.bytedance.hybrid.spark.SparkContext r0 = X.C018Z.LJ(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r31, r33, r34, r35, r36, r37, r39, r41, r43, r45, r46, r47, r48, r49)
            r2.LLLII = r0
        L86:
            return
        L87:
            if (r0 == 0) goto L8a
            goto L3f
        L8a:
            r5 = 0
            if (r0 != 0) goto L45
            r3 = 0
            r0 = 0
            goto L49
        L93:
            r27 = r33
            goto L35
        L96:
            r27 = r33
            r7 = 1
            goto L37
        L9a:
            r14 = r8
            r13 = r8
            r24 = r8
            goto L2b
        L9f:
            java.lang.String r18 = "setup_page_templates"
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesSettingsPage.zS(boolean):void");
    }

    public final void ES(View view, Function1<? super View, Unit> function1) {
        C786410Ut5.I7(new AbS517S0200000_33(view, function1, 0), view);
    }

    @Override // X.C1AIP
    public final void hA(C1AIG c1aig, C1AIE c1aie) {
        String string;
        CharSequence text;
        String string2;
        CharSequence text2;
        CharSequence text3;
        float alpha;
        float alpha2;
        CharSequence text4;
        this.LLLFZ = c1aie.LIZ;
        this.LLLI = c1aie;
        C16F5 c16f5 = c1aig.LLILZIL;
        String str = "";
        if (c16f5 == null || (text4 = c16f5.getText()) == null || (string = text4.toString()) == null) {
            string = "";
        }
        c1aie.LJIIJ = string;
        C1324720kZq c1324720kZq = this.LLLLLJIL;
        float alpha3 = 1.0f;
        if (c1324720kZq != null) {
            C1324720kZq c1324720kZq2 = c1aig.LL;
            if (c1324720kZq2 != null) {
                alpha2 = c1324720kZq2.getAlpha();
            } else {
                alpha2 = 1.0f;
            }
            C786410Ut5.h5(c1324720kZq, alpha2);
        }
        View view = this.LLLLLL;
        if (view != null) {
            View view2 = c1aig.LLILLL;
            if (view2 != null) {
                alpha = view2.getAlpha();
            } else {
                alpha = 1.0f;
            }
            C786410Ut5.T4(view, alpha);
        }
        View view3 = this.LLLLLLIL;
        if (view3 != null) {
            View view4 = c1aig.LLILZ;
            if (view4 != null) {
                alpha3 = view4.getAlpha();
            }
            C786410Ut5.T4(view3, alpha3);
        }
        C1819620xS4.LIZ().LJIIIZ(c1aie.LJ).LJJI(this.LLLLLJIL);
        C16F5 c16f52 = this.LLLLLJLJLL;
        if (c16f52 != null) {
            C16F5 c16f53 = c1aig.LLILLJJLI;
            if (c16f53 != null) {
                text3 = c16f53.getText();
            } else {
                text3 = null;
            }
            c16f52.setText(text3);
        }
        final LiveEditText liveEditText = this.LLLLLLJ;
        if (liveEditText != null) {
            C16F5 c16f54 = c1aig.LLILZIL;
            if (c16f54 == null || (text2 = c16f54.getText()) == null) {
                text2 = "";
            }
            liveEditText.setText(text2);
            liveEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.1AI8
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view5, boolean z) {
                    String string3;
                    ViewGroup.LayoutParams layoutParams;
                    List<C1AIE> list;
                    int iIntValue;
                    C1AIE c1aie2;
                    String str2;
                    C1AI9 c1ai9;
                    List<C1AIE> list2;
                    List<GiftPickWithStatus> list3;
                    C1AIE c1aie3;
                    C1AIE c1aie4;
                    GiftPickWithStatus giftPickWithStatus;
                    String str3;
                    String string4;
                    Editable editableLLLFZ;
                    ViewGroup.LayoutParams layoutParams2;
                    if (z) {
                        C500260Jjc.LLFFF(this.LL.LLLLLIL);
                        C500260Jjc.LJIILIIL(this.LL.LLLIL);
                        C500260Jjc.LJIILIIL(this.LL.LLLIZZ);
                        C500260Jjc.LJIILIIL(this.LL.LLLJ);
                        C500260Jjc.LJIILIIL(this.LL.LLLJIL);
                        C500260Jjc.LLFFF(this.LL.LLLLLILLIL);
                        C500260Jjc.LJIILIIL(this.LL.LLLLIIL);
                        C500260Jjc.LJIILIIL(this.LL.LLLLIILL);
                        ConstraintLayout constraintLayout = this.LL.LLLIIIIL;
                        if (constraintLayout != null && (layoutParams2 = constraintLayout.getLayoutParams()) != null) {
                            layoutParams2.height = -2;
                            return;
                        }
                        return;
                    }
                    C500260Jjc.LJIILIIL(this.LL.LLLLLIL);
                    C500260Jjc.LLFFF(this.LL.LLLIL);
                    C500260Jjc.LLFFF(this.LL.LLLIZZ);
                    C500260Jjc.LLFFF(this.LL.LLLJ);
                    C500260Jjc.LLFFF(this.LL.LLLJIL);
                    C500260Jjc.LJIILIIL(this.LL.LLLLLILLIL);
                    C500260Jjc.LLFFF(this.LL.LLLLIIL);
                    this.LL.JS();
                    ViewerWishesSettingsPage viewerWishesSettingsPage = this.LL;
                    LiveEditText liveEditText2 = viewerWishesSettingsPage.LLLLLLJ;
                    String str4 = "";
                    if (liveEditText2 == null || (editableLLLFZ = C2204961BRm.LLLFZ(liveEditText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/SM4XHvMrwuGDNvBZ8+rOzhiMoiiraWiWHHtBuR+yinlUFo/5HuVfQGL76OdURAt0g==", null))) == null || (string3 = editableLLLFZ.toString()) == null) {
                        string3 = "";
                    }
                    C1AI9 c1ai92 = viewerWishesSettingsPage.LLLF;
                    if (c1ai92 != null && (list = c1ai92.LJIL) != null && (iIntValue = ((Number) C500260Jjc.LJI(list, new AwS612S0100000_33(viewerWishesSettingsPage, 194)).getSecond()).intValue()) >= 0 && (c1aie2 = viewerWishesSettingsPage.LLLI) != null && viewerWishesSettingsPage.LLLFZ != 0) {
                        String string5 = Long.valueOf(c1aie2.LIZIZ).toString();
                        String str5 = CardStruct.IStatusCode.DEFAULT;
                        if (string5 == null) {
                            string5 = CardStruct.IStatusCode.DEFAULT;
                        }
                        C1AIE c1aie5 = viewerWishesSettingsPage.LLLI;
                        if (c1aie5 != null && (string4 = Integer.valueOf(c1aie5.LIZJ).toString()) != null) {
                            str5 = string4;
                        }
                        C1AIE c1aie6 = viewerWishesSettingsPage.LLLI;
                        if (c1aie6 != null && (str3 = c1aie6.LJIIJ) != null) {
                            str4 = str3;
                        }
                        C1AI2 c1ai2 = new C1AI2("save_content", null, C1AI1.LIZIZ(viewerWishesSettingsPage.LLLFF), null, null, null, null, 0L, 0L, null, null, null, null, null, string5, str5, null, null, str4, string3, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -835590, 2097151);
                        C1AI1.LIZ(c1ai2, viewerWishesSettingsPage.LLJLLL, true);
                        C1AI0.LJIIL(c1ai2);
                        C1AIE c1aie7 = viewerWishesSettingsPage.LLLI;
                        if (c1aie7 != null) {
                            str2 = c1aie7.LJIIJ;
                        } else {
                            str2 = null;
                        }
                        if (!Intrinsics.LJFF(str2, string3) && (c1ai9 = viewerWishesSettingsPage.LLLF) != null && !c1ai9.LJJIII && (list2 = c1ai9.LJIL) != null && iIntValue < list2.size() && (list3 = c1ai9.LJJ) != null && iIntValue < list3.size()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("editItemDescription, description = ");
                            sbLIZ.append(string3);
                            sbLIZ.append(", index = ");
                            sbLIZ.append(iIntValue);
                            C20441214yg.LIZIZ("ViewerWishesSettingPresenter", C2188811AlT.LIZIZ(sbLIZ));
                            c1ai9.LJJIII = true;
                            List<GiftPickWithStatus> list4 = c1ai9.LJJ;
                            if (list4 != null && (giftPickWithStatus = (GiftPickWithStatus) C13LP.LJJJLZIJ(iIntValue, list4)) != null) {
                                GiftPick giftPick = giftPickWithStatus.giftPick;
                                if (giftPick != null) {
                                    giftPick.customizedDesc = string3;
                                }
                                giftPickWithStatus.contentSource = C1AI9.LJFF(giftPickWithStatus.contentSource);
                            }
                            List<C1AIE> list5 = c1ai9.LJIL;
                            if (list5 != null && (c1aie4 = (C1AIE) C13LP.LJJJLZIJ(iIntValue, list5)) != null) {
                                c1aie4.LJFF = string3;
                                c1aie4.LJIILL = c1ai9.LJIILJJIL.contains(string3);
                                c1aie4.LJIIJJI = C1AI9.LJFF(c1aie4.LJIIJJI);
                            }
                            List<C1AIE> list6 = c1ai9.LJIL;
                            if (list6 != null && (c1aie3 = (C1AIE) C13LP.LJJJLZIJ(iIntValue, list6)) != null) {
                                c1ai9.LJIIZILJ(C1697810uHb.LJIILJJIL(C1AI9.LJI(c1aie3)), 2, 0, 0L, 0L, "");
                            }
                        }
                        viewerWishesSettingsPage.LLLFZ = 0L;
                        viewerWishesSettingsPage.LLLI = null;
                    }
                    ConstraintLayout constraintLayout2 = this.LL.LLLIIIIL;
                    if (constraintLayout2 != null && (layoutParams = constraintLayout2.getLayoutParams()) != null) {
                        this.LL.getClass();
                        layoutParams.height = (int) (C1338790kwX.LIZLLL(null) * 0.73f);
                    }
                    liveEditText.setOnFocusChangeListener(null);
                    KeyBoardUtil.LIZJ(this.LL.getContext(), this.LL.LLLLLLJ);
                }
            });
            liveEditText.setFilters(new InputFilter[]{new InputFilter() { // from class: X.1AIQ
                /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
                @Override // android.text.InputFilter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.CharSequence filter(java.lang.CharSequence r6, int r7, int r8, android.text.Spanned r9, int r10, int r11) {
                    /*
                        r5 = this;
                        java.lang.String r4 = r6.toString()
                        java.lang.String r0 = com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesSettingsPage._pnsPageId
                        if (r4 == 0) goto L68
                        int r0 = r4.length()
                        if (r0 == 0) goto L68
                        int r3 = r4.length()
                        r2 = 0
                    L13:
                        if (r2 >= r3) goto L68
                        char r1 = r4.charAt(r2)
                        if (r1 == 0) goto L42
                        r0 = 9
                        if (r1 == r0) goto L42
                        r0 = 10
                        if (r1 == r0) goto L42
                        r0 = 13
                        if (r1 == r0) goto L42
                        r0 = 32
                        if (r0 > r1) goto L6a
                        r0 = 55296(0xd800, float:7.7486E-41)
                        if (r1 < r0) goto L42
                        r0 = 57344(0xe000, float:8.0356E-41)
                        if (r0 > r1) goto L45
                        r0 = 65534(0xfffe, float:9.1833E-41)
                        if (r1 < r0) goto L42
                        r0 = 65536(0x10000, float:9.1835E-41)
                        if (r0 > r1) goto L45
                        r0 = 1114112(0x110000, float:1.561203E-39)
                        if (r1 >= r0) goto L6a
                    L42:
                        int r2 = r2 + 1
                        goto L13
                    L45:
                        r0 = 8304(0x2070, float:1.1636E-41)
                        if (r0 > r1) goto L6a
                        r0 = 11264(0x2c00, float:1.5784E-41)
                        if (r1 < r0) goto L42
                        r0 = 12288(0x3000, float:1.7219E-41)
                        if (r0 > r1) goto L6a
                        r0 = 12544(0x3100, float:1.7578E-41)
                        if (r1 < r0) goto L42
                        r0 = 12800(0x3200, float:1.7937E-41)
                        if (r0 > r1) goto L6a
                        r0 = 13056(0x3300, float:1.8295E-41)
                        if (r1 < r0) goto L42
                        r0 = 126976(0x1f000, float:1.77931E-40)
                        if (r0 > r1) goto L6a
                        r0 = 129648(0x1fa70, float:1.81676E-40)
                        if (r1 >= r0) goto L6a
                        goto L42
                    L68:
                        r0 = 0
                        goto L6b
                    L6a:
                        r0 = 1
                    L6b:
                        java.lang.String r4 = ""
                        if (r0 == 0) goto L70
                        return r4
                    L70:
                        java.lang.String r0 = r6.toString()
                        boolean r0 = X.C1489350orN.LIZLLL(r0)
                        if (r0 == 0) goto L7b
                        return r4
                    L7b:
                        java.lang.String r3 = r6.toString()
                        if (r3 == 0) goto Laa
                        int r0 = r3.length()
                        if (r0 == 0) goto Laa
                        r2 = 0
                    L88:
                        int r0 = r3.length()
                        if (r2 >= r0) goto Laa
                        char r0 = r3.charAt(r2)
                        int r1 = java.lang.Character.getType(r0)
                        r0 = 25
                        if (r1 == r0) goto La9
                        r0 = 26
                        if (r1 == r0) goto La9
                        r0 = 27
                        if (r1 == r0) goto La9
                        r0 = 28
                        if (r1 == r0) goto La9
                        int r2 = r2 + 1
                        goto L88
                    La9:
                        return r4
                    Laa:
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1AIQ.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
                }
            }, new InputFilter.LengthFilter() { // from class: X.1AIS
            }});
        }
        GS();
        KeyBoardUtil.LIZLLL(getContext(), this.LLLLLLJ);
        String strValueOf = String.valueOf(c1aie.LIZIZ);
        String strValueOf2 = String.valueOf(c1aie.LIZJ);
        C16F5 c16f55 = c1aig.LLILZIL;
        if (c16f55 != null && (text = c16f55.getText()) != null && (string2 = text.toString()) != null) {
            str = string2;
        }
        C1AI2 c1ai2 = new C1AI2("add_content_page_show", null, C1AI1.LIZIZ(this.LLLFF), null, null, null, null, 0L, 0L, null, null, null, null, null, strValueOf, strValueOf2, null, null, str, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -311302, 2097151);
        C1AI1.LIZ(c1ai2, this.LLJLLL, true);
        C1AI0.LJIIL(c1ai2);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1324720kZq c1324720kZq;
        C16F5 c16f5;
        View viewFindViewById;
        View viewFindViewById2;
        LiveEditText liveEditText;
        RunnableC781530UlD runnableC781530UlD;
        View viewFindViewById3;
        C16F5 c16f52;
        final int iIntValue;
        View view2;
        LiveIconView liveIconView;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        this.LLLIIIIL = (ConstraintLayout) view.findViewById(R.id.viewer_wishes_settings_dialog_layout);
        view.findViewById(R.id.viewer_wishes_title);
        this.LLLIIIL = (C16F5) view.findViewById(R.id.viewer_wishes_desc);
        this.LLLIIL = (LiveIconView) view.findViewById(R.id.viewer_wishes_faq);
        this.LLLIILIL = (LiveIconView) view.findViewById(R.id.viewer_wishes_settings);
        this.LLLIL = view.findViewById(R.id.xis);
        this.LLLILZ = (C16F5) view.findViewById(R.id.xiw);
        this.LLLILZJ = (C1324720kZq) view.findViewById(R.id.xiv);
        this.LLLILZLLLI = (LiveIconView) view.findViewById(R.id.xiu);
        this.LLLIZZ = (C16F5) view.findViewById(R.id.viewer_wishes_list_title);
        this.LLLJ = view.findViewById(R.id.viewer_wishes_add_btn);
        this.LLLJIL = (RunnableC781530UlD) view.findViewById(R.id.viewer_wishes_gift_list);
        this.LLLJL = view.findViewById(R.id.viewer_wishes_gift_list_empty);
        this.LLLLIIL = (C16FS) view.findViewById(R.id.viewer_wishes_start_btn);
        this.LLLLIILL = (C16FS) view.findViewById(R.id.viewer_wishes_turn_off_btn);
        this.LLLLILI = (C16FZ) view.findViewById(R.id.viewer_wishes_settings_loading_view);
        this.LLLLJ = (C16F5) view.findViewById(R.id.viewer_wishes_loading_error_content);
        this.LLLLJI = view.findViewById(R.id.viewer_wishes_loading_error_retry_button);
        this.LLLLL = view.findViewById(R.id.viewer_wishes_settings_item_loading_view);
        this.LLLLLIL = view.findViewById(R.id.viewer_wishes_keyboard_hide_touch_view);
        View viewFindViewById4 = view.findViewById(R.id.viewer_wishes_quick_edit);
        this.LLLLLILLIL = viewFindViewById4;
        if (viewFindViewById4 != null) {
            c1324720kZq = (C1324720kZq) viewFindViewById4.findViewById(R.id.viewer_wishes_item_gift_pic);
        } else {
            c1324720kZq = null;
        }
        this.LLLLLJIL = c1324720kZq;
        View view3 = this.LLLLLILLIL;
        if (view3 != null) {
            c16f5 = (C16F5) view3.findViewById(R.id.viewer_wishes_item_gift_price);
        } else {
            c16f5 = null;
        }
        this.LLLLLJLJLL = c16f5;
        View view4 = this.LLLLLILLIL;
        if (view4 != null) {
            viewFindViewById = view4.findViewById(R.id.viewer_wishes_item_gift_price_bg);
        } else {
            viewFindViewById = null;
        }
        this.LLLLLL = viewFindViewById;
        View view5 = this.LLLLLILLIL;
        if (view5 != null) {
            viewFindViewById2 = view5.findViewById(R.id.viewer_wishes_item_gift_coin_icon);
        } else {
            viewFindViewById2 = null;
        }
        this.LLLLLLIL = viewFindViewById2;
        View view6 = this.LLLLLILLIL;
        if (view6 != null) {
            liveEditText = (LiveEditText) view6.findViewById(R.id.viewer_wishes_item_edit_description);
        } else {
            liveEditText = null;
        }
        this.LLLLLLJ = liveEditText;
        View view7 = this.LLLLLILLIL;
        if (view7 != null) {
            runnableC781530UlD = (RunnableC781530UlD) view7.findViewById(R.id.viewer_wishes_item_recommendations_list);
        } else {
            runnableC781530UlD = null;
        }
        this.LLLLLLL = runnableC781530UlD;
        View view8 = this.LLLLLILLIL;
        if (view8 != null) {
            viewFindViewById3 = view8.findViewById(R.id.viewer_wishes_gift_item);
        } else {
            viewFindViewById3 = null;
        }
        this.LLLLLLLLL = viewFindViewById3;
        View view9 = this.LLLLLILLIL;
        if (view9 != null) {
            c16f52 = (C16F5) view9.findViewById(R.id.viewer_wishes_guideline_text);
        } else {
            c16f52 = null;
        }
        this.LLLLIL = c16f52;
        View view10 = this.LLLLLILLIL;
        if (view10 != null) {
            view10.findViewById(R.id.viewer_wishes_guideline_icon);
        }
        ConstraintLayout constraintLayout = this.LLLIIIIL;
        if (constraintLayout != null && (layoutParams = constraintLayout.getLayoutParams()) != null) {
            layoutParams.height = (int) (C1338790kwX.LIZLLL(null) * 0.73f);
        }
        View view11 = this.LLLLLILLIL;
        if (view11 != null) {
            ES(view11, new AwS612S0100000_33(this, 37));
        }
        View view12 = this.LLLLLIL;
        if (view12 != null) {
            ES(view12, new AwS612S0100000_33(this, 38));
        }
        LiveIconView liveIconView2 = this.LLLIIL;
        if (liveIconView2 != null) {
            C786410Ut5.I7(new AbS517S0200000_33((View) liveIconView2, (Function1) new AwS596S0100000_17(this, 481), 3), liveIconView2);
        }
        if (C497740JfY.LJJ() && (liveIconView = this.LLLIIL) != null) {
            C786410Ut5.Zb(liveIconView, -1.0f);
        }
        View view13 = this.LLLJ;
        if (view13 != null) {
            C786410Ut5.I7(new AbS517S0200000_33(view13, new AwS612S0100000_33(this, 195), 3), view13);
        }
        FS(true);
        View view14 = this.LLLLJI;
        if (view14 != null) {
            ES(view14, new AwS612S0100000_33(this, 190));
        }
        Integer numLIZ = InterfaceC1106030et7.aa.LIZ();
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = 0;
        }
        final String strLJIJJ = C497740JfY.LJIJJ(2131856945, this.LLLFF.LJII);
        if (iIntValue < 3 && (view2 = this.LLLJ) != null) {
            HandlerHook.viewPost(view2, new Runnable() { // from class: X.0fFd
                public final void LIZ() {
                    if (this.LL.LLLFF.LJII.length() == 0 || Intrinsics.LJFF(a0.LJLIIIL(this.LL.LLLFF.LJIIIZ).toString(), "overwrite")) {
                        return;
                    }
                    C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                    C1113800f5e.LIZJ(EnumC1120860fH2.BACKPACK_GIFTS);
                    C1113800f5e c1113800f5e2 = C1113800f5e.LIZ;
                    C785230UrB c785230UrB = new C785230UrB(this.LL.LLLJ);
                    c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
                    c785230UrB.LJIIIZ = true;
                    c785230UrB.LJIJJ = strLJIJJ;
                    c785230UrB.LJIIZILJ = true;
                    c785230UrB.LJ(R.attr.ca1);
                    c785230UrB.LIZIZ(R.attr.c63);
                    c785230UrB.LJFF = 8388611;
                    c785230UrB.LJIJ = false;
                    c1113800f5e2.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.BACKPACK_GIFTS, this.LL.LLJLLL);
                    InterfaceC1106030et7.aa.LIZJ(Integer.valueOf(iIntValue + 1));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ViewerWishesSettingsPage@5f7d.initCampaignBubbleView$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ViewerWishesSettingsPage@5f7d.initCampaignBubbleView$1");
                }
            });
        }
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null) {
            dataChannel.BQ2(this, VWSettingsPageCloseChannel.class, new AwS612S0100000_33(this, 193));
        }
        DataChannel dataChannel2 = this.LLJLLL;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, ViewerWishesStatus.class, this.LLLLLLLZIL);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hx1, viewGroup, false);
    }
}
