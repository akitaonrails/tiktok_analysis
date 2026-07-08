package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.AnonymousClass0956;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0OLV;
import X.C0OS2;
import X.C0OS8;
import X.C0OTJ;
import X.C0OVA;
import X.C0VSJ;
import X.C13LE;
import X.C1558420qem;
import X.C1558520qew;
import X.C194434115c;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C21568519b1;
import X.C21568919b5;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2231808om;
import X.C2233808p6;
import X.C2233908p7;
import X.C23250099c;
import X.C293310Beb;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C619600ORy;
import X.C621210OYd;
import X.C621240OYg;
import X.C621250OYh;
import X.C621280OYk;
import X.C621370OYt;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC617060OIe;
import X.EnumC621190OYb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC619700OSi;
import X.InterfaceC619830OSv;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS113S0200000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMediaViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommentAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS125S1200000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS94S1200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinVoiceCell extends BulletinBaseCell<BulletinVoiceItem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public C621210OYd LLJLLL;
    public InterfaceC619700OSi LLJZ;
    public boolean LLJZIJLIL;
    public final AssemVMLazy LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinVoiceCell.class, "_mediaVm", "get_mediaVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinMediaViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void C6() {
        ViewStub viewStub;
        ViewStub viewStub2;
        super.C6();
        if (this.LLJLLL == null && (viewStub2 = (ViewStub) this.itemView.findViewById(R.id.d0c)) != null) {
            this.LLJLLL = new C621210OYd(viewStub2, To(), a6(), new AwS553S0100000_9(this, 774), LifecycleOwnerKt.getLifecycleScope(this), f6());
            w6();
            C21568919b5 c21568919b5R6 = r6();
            if ((c21568919b5R6 instanceof InterfaceC619830OSv) && c21568919b5R6 != null) {
                C621210OYd c621210OYd = this.LLJLLL;
                c21568919b5R6.setDragPassthroughView(c621210OYd != null ? c621210OYd.LJIIJJI : null);
            }
        }
        if (this.LLJZIJLIL) {
            return;
        }
        this.LLJZIJLIL = true;
        InterfaceC619700OSi c0os2 = ((C0OS8.LIZIZ() && C293310Beb.LIZLLL()) || (viewStub = (ViewStub) this.itemView.findViewById(R.id.d09)) == null) ? null : C0OS8.LIZIZ() ? new C0OS2(viewStub, this, a6(), f6(), To(), new AwS553S0100000_9(this, 2)) : new C619600ORy(viewStub, this, f6(), a6(), C1558420qem.LIZIZ(this));
        this.LLJZ = c0os2;
        if (c0os2 != null) {
            T6(this.itemView.findViewById(R.id.d09));
        }
        C1558520qew.LJII(C1558420qem.LIZIZ(this), this, BulletinCommentAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void z6() {
        super.z6();
        AssemViewModel.asyncSubscribe$default(X5(), new C2217371BqR() { // from class: X.0OSp
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OYC) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0OYC) obj).LL = (AbstractC1623806Xk) obj2;
            }
        }, this, C736820SvI.LIZLLL(), null, null, new AwS588S0100000_9(this, 198), 24, null);
    }

    public BulletinVoiceCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinMediaViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 789);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(333);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 773), awS553S0100000_9, AFwS195S0000000_9.get$arr$(189), new AwS553S0100000_9((C03K6) this, 775), new AwS553S0100000_9((C03K6) this, 777), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 779), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 781), null, new AwS553S0100000_9((C03K6) this, 782));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((C03K6) this, 776);
            AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 778);
            AwS553S0100000_9 awS553S0100000_94 = new AwS553S0100000_9(c19719912DlLIZ, 780);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_92, 33));
            AwS553S0100000_9 awS553S0100000_95 = new AwS553S0100000_9(c01gwLIZIZ, 783);
            AwS553S0100000_9 awS553S0100000_96 = new AwS553S0100000_9(c01gwLIZIZ, 784);
            AwS553S0100000_9 awS553S0100000_97 = new AwS553S0100000_9(c01gwLIZIZ, 785);
            AwS553S0100000_9 awS553S0100000_98 = new AwS553S0100000_9(c01gwLIZIZ, 786);
            AwS553S0100000_9 awS553S0100000_99 = new AwS553S0100000_9(c01gwLIZIZ, 787);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS553S0100000_94, awS553S0100000_9, new C452080Ho6(), awS553S0100000_95, awS553S0100000_96, awS553S0100000_93, aFwS240S0000000_9, awS553S0100000_97, awS553S0100000_98, awS553S0100000_99);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 788), awS553S0100000_9, AFwS195S0000000_9.get$arr$(190), new AwS553S0100000_9((C03K6) this, 790), new AwS553S0100000_9((C03K6) this, 791), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 792), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 793), null, new AwS553S0100000_9((C03K6) this, 794));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 795), awS553S0100000_9, AFwS195S0000000_9.get$arr$(191), new AwS553S0100000_9((C03K6) this, 796), new AwS553S0100000_9((C03K6) this, 797), new AwS553S0100000_9((C03K6) this, 771), aFwS240S0000000_9, null, null, new AwS553S0100000_9((C03K6) this, 772));
        }
        this.LLL = assemVMLazy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final Map<String, String> S5() {
        BulletinVoiceItem bulletinVoiceItem = (BulletinVoiceItem) getItem();
        return bulletinVoiceItem == null ? C2097608Jq.LJ() : C2097908Jt.LIZJ(new Pair("total_duration", String.valueOf(bulletinVoiceItem.LLJI)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final Map<String, String> W5() {
        BulletinVoiceItem bulletinVoiceItem = (BulletinVoiceItem) getItem();
        return bulletinVoiceItem == null ? C2097608Jq.LJ() : C2097608Jq.LJIIIIZZ(new Pair("content_type", "voice"), new Pair("total_duration", String.valueOf(bulletinVoiceItem.LLJI)));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C621210OYd c621210OYd = this.LLJLLL;
        if (c621210OYd != null) {
            c621210OYd.LJJII();
            c621210OYd.LJJIFFI();
        }
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        for (ViewParent parent = this.itemView.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof View) && ((View) parent).getId() == R.id.d1i) {
                C621210OYd c621210OYd = this.LLJLLL;
                if (c621210OYd == null || c621210OYd.LJJIIJZLJL) {
                    return;
                }
                c621210OYd.LJJIIJZLJL = true;
                c621210OYd.LJJII();
                C194434115c c194434115c = c621210OYd.LJIIJJI;
                if (c194434115c != null) {
                    c194434115c.setOnSeekListener(null);
                }
                C194434115c c194434115c2 = c621210OYd.LJIIJJI;
                if (c194434115c2 != null) {
                    c194434115c2.setOnSeekFinishedListener(null);
                }
                TuxIconView tuxIconView = c621210OYd.LJII;
                if (tuxIconView != null) {
                    C786410Ut5.a9(tuxIconView, null);
                }
                View view = c621210OYd.LJIIIIZZ;
                if (view != null) {
                    C786410Ut5.I7(null, view);
                }
                TuxIconView tuxIconView2 = c621210OYd.LJIIIZ;
                if (tuxIconView2 != null) {
                    C786410Ut5.a9(tuxIconView2, null);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        C621370OYt c621370OYtLJIIJ;
        Long l;
        super.unBind();
        C621210OYd c621210OYd = this.LLJLLL;
        if (c621210OYd != null) {
            BulletinVoiceItem bulletinVoiceItem = c621210OYd.LJIILIIL;
            String string = (bulletinVoiceItem == null || (l = bulletinVoiceItem.LLJJIJI) == null) ? null : l.toString();
            if (!c621210OYd.LJJIIJZLJL && (c621370OYtLJIIJ = c621210OYd.LJIIJ()) != null && string != null && c621370OYtLJIIJ.LIZIZ(string)) {
                c621210OYd.LJIJJ(string);
            }
            c621210OYd.LJJII();
            AnonymousClass0956 anonymousClass0956 = c621210OYd.LJIILLIIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c621210OYd.LJIILLIIL = null;
            c621210OYd.LJJ(false);
            c621210OYd.LJIILIIL = null;
            c621210OYd.LJIL = null;
            c621210OYd.LJIJJ = null;
            c621210OYd.LJIJJLI = false;
            c621210OYd.LJJ = null;
            c621210OYd.LJJI = EnumC621190OYb.BULLETIN_FRONT_STYLE_NONE;
            c621210OYd.LJJIII = null;
            c621210OYd.LJJIIJ = null;
            c621210OYd.LJJIFFI = null;
            c621210OYd.LJJII = false;
        }
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b7(Long l) {
        Long l2;
        BulletinVoiceItem bulletinVoiceItem = (BulletinVoiceItem) getItem();
        if (bulletinVoiceItem != null) {
            l2 = bulletinVoiceItem.LLJJIJI;
        } else {
            l2 = null;
        }
        return !Intrinsics.LJFF(l2, l);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: h7, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(BulletinVoiceItem bulletinVoiceItem) {
        float f;
        String string;
        boolean z;
        boolean z2;
        BulletinMediaViewModel bulletinMediaViewModelInvoke;
        C2231808om c2231808om;
        long jLongValue;
        long jLongValue2;
        int value;
        String str;
        Long lLJIILIIL;
        int i;
        ViewGroup.LayoutParams layoutParams;
        super.onBindItemView(bulletinVoiceItem);
        C621210OYd c621210OYd = this.LLJLLL;
        if (c621210OYd != null) {
            c621210OYd.LJIILIIL = bulletinVoiceItem;
            C194434115c c194434115c = c621210OYd.LJIIJJI;
            if (c194434115c != null) {
                c194434115c.setMode(1);
            }
            C194434115c c194434115c2 = c621210OYd.LJIIJJI;
            if (c194434115c2 != null) {
                c194434115c2.setFillWidth(false);
            }
            List<Float> list = bulletinVoiceItem.LLJILJIL;
            if (list.isEmpty()) {
                list = C621210OYd.LJJIIZ;
            }
            float f2 = C194434115c.LLJJJJ;
            int size = list.size();
            float f3 = c621210OYd.LJFF.getResources().getDisplayMetrics().widthPixels;
            if (c621210OYd.LIZ) {
                f = 0.75f;
            } else {
                f = 0.85f;
            }
            int i2 = (((int) (f3 * f)) - C621210OYd.LJJIJ) - C621210OYd.LJJIIZI;
            if (i2 < 0) {
                i2 = 0;
            }
            int iCeil = (int) Math.ceil(Math.max(1, size) * C194434115c.LLJJJJ);
            if (iCeil <= i2) {
                i2 = iCeil;
            }
            C194434115c c194434115c3 = c621210OYd.LJIIJJI;
            if (c194434115c3 != null && (layoutParams = c194434115c3.getLayoutParams()) != null && layoutParams.width != i2) {
                layoutParams.width = i2;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c194434115c3);
                c194434115c3.setLayoutParams(layoutParams);
            }
            List<Float> list2 = bulletinVoiceItem.LLJILJIL;
            if (list2.isEmpty()) {
                list2 = C621210OYd.LJJIIZ;
            }
            C194434115c c194434115c4 = c621210OYd.LJIIJJI;
            if (c194434115c4 != null) {
                c194434115c4.setWaveformData(list2);
            }
            Long l = bulletinVoiceItem.LLJJIJI;
            if (l == null || (string = l.toString()) == null) {
                string = "";
            }
            if (bulletinVoiceItem.LLILLL && bulletinVoiceItem.LLJJI) {
                C194434115c c194434115c5 = c621210OYd.LJIIJJI;
                if (c194434115c5 != null) {
                    c194434115c5.setProgress(0.0f);
                }
                TuxTextView tuxTextView = c621210OYd.LJIIL;
                if (tuxTextView != null) {
                    tuxTextView.setText(C621210OYd.LJI(bulletinVoiceItem.LLJI));
                }
                c621210OYd.LJJ(true);
                c621210OYd.LIZLLL(string, false, false);
                TuxIconView tuxIconView = c621210OYd.LJII;
                if (tuxIconView != null) {
                    C786410Ut5.a9(tuxIconView, null);
                }
                View view = c621210OYd.LJIIIIZZ;
                if (view != null) {
                    C786410Ut5.I7(null, view);
                }
                TuxIconView tuxIconView2 = c621210OYd.LJIIIZ;
                if (tuxIconView2 != null) {
                    C786410Ut5.a9(tuxIconView2, null);
                }
                C194434115c c194434115c6 = c621210OYd.LJIIJJI;
                if (c194434115c6 != null) {
                    c194434115c6.setOnSeekListener(null);
                }
                C194434115c c194434115c7 = c621210OYd.LJIIJJI;
                if (c194434115c7 != null) {
                    c194434115c7.setOnSeekFinishedListener(null);
                }
                c621210OYd.LJJII();
                AnonymousClass0956 anonymousClass0956 = c621210OYd.LJIILLIIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c621210OYd.LJIILLIIL = null;
                C621370OYt c621370OYtLJIIJ = c621210OYd.LJIIJ();
                if (c621370OYtLJIIJ != null && c621370OYtLJIIJ.LIZIZ(string)) {
                    c621370OYtLJIIJ.LJIIJ();
                }
            } else {
                if (!c621210OYd.LIZ && c621210OYd.LJIIL(string)) {
                    z = false;
                } else {
                    z = true;
                }
                c621210OYd.LJIJI = z;
                c621210OYd.LJJ(false);
                C621280OYk c621280OYkLJIILJJIL = c621210OYd.LJIILJJIL(string);
                if (c621280OYkLJIILJJIL != null && (i = c621280OYkLJIILJJIL.LIZIZ) > 0) {
                    C194434115c c194434115c8 = c621210OYd.LJIIJJI;
                    if (c194434115c8 != null) {
                        c194434115c8.setProgress(c621280OYkLJIILJJIL.LIZ / i);
                    }
                    int i3 = c621280OYkLJIILJJIL.LIZIZ - c621280OYkLJIILJJIL.LIZ;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    long j = i3;
                    TuxTextView tuxTextView2 = c621210OYd.LJIIL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(C621210OYd.LJI(j));
                    }
                } else {
                    C194434115c c194434115c9 = c621210OYd.LJIIJJI;
                    if (c194434115c9 != null) {
                        c194434115c9.setProgress(0.0f);
                    }
                    TuxTextView tuxTextView3 = c621210OYd.LJIIL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(C621210OYd.LJI(bulletinVoiceItem.LLJI));
                    }
                }
                c621210OYd.LIZLLL(string, c621210OYd.LJIIL(string), false);
                C621370OYt c621370OYtLJIIJ2 = c621210OYd.LJIIJ();
                if (c621370OYtLJIIJ2 != null) {
                    c621210OYd.LJJIIJ(null, c621370OYtLJIIJ2.LIZJ(string));
                }
                ACListenerS113S0200000_9 aCListenerS113S0200000_9 = new ACListenerS113S0200000_9(c621210OYd, bulletinVoiceItem, 40);
                TuxIconView tuxIconView3 = c621210OYd.LJII;
                if (tuxIconView3 != null) {
                    C786410Ut5.a9(tuxIconView3, aCListenerS113S0200000_9);
                }
                View view2 = c621210OYd.LJIIIIZZ;
                if (view2 != null) {
                    C786410Ut5.I7(aCListenerS113S0200000_9, view2);
                }
                TuxIconView tuxIconView4 = c621210OYd.LJIIIZ;
                if (tuxIconView4 != null) {
                    C786410Ut5.a9(tuxIconView4, aCListenerS113S0200000_9);
                }
                C194434115c c194434115c10 = c621210OYd.LJIIJJI;
                if (c194434115c10 != null) {
                    c194434115c10.setOnSeekListener(new AwS94S1200000_9(bulletinVoiceItem, c621210OYd, string, 5));
                }
                C194434115c c194434115c11 = c621210OYd.LJIIJJI;
                if (c194434115c11 != null) {
                    c194434115c11.setOnSeekFinishedListener(new AwS125S1200000_9(bulletinVoiceItem, c621210OYd, string, 18));
                }
                c621210OYd.LJJII();
                c621210OYd.LJIILJJIL = C23250099c.LIZLLL(c621210OYd.LIZLLL, null, null, new C621250OYh(c621210OYd, string, null), 3);
                c621210OYd.LJIILL = C23250099c.LIZLLL(c621210OYd.LIZLLL, null, null, new C621240OYg(c621210OYd, string, null), 3);
                String str2 = bulletinVoiceItem.LLILZLL;
                if (str2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    C0OLV c0olvHh2 = c621210OYd.LJ.Hh2();
                    if (c0olvHh2 != null && (str = c0olvHh2.LL) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    Long l2 = bulletinVoiceItem.LLJJIJI;
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    BulletinCommonAbility bulletinCommonAbility = c621210OYd.LIZIZ;
                    if (bulletinCommonAbility != null) {
                        value = bulletinCommonAbility.bB();
                    } else {
                        value = EnumC617060OIe.INVALID.getValue();
                    }
                    C2233808p6 c2233808p6 = C2233808p6.LIZ;
                    boolean z3 = c621210OYd.LIZ;
                    c2233808p6.getClass();
                    if (str2.length() != 0) {
                        ConcurrentHashMap<String, C2233908p7> concurrentHashMap = C2233808p6.LIZJ;
                        if (concurrentHashMap.get(str2) == null) {
                            concurrentHashMap.putIfAbsent(str2, new C2233908p7(str2, jLongValue, jLongValue2, System.currentTimeMillis(), z3, value));
                        }
                    }
                }
                String str3 = bulletinVoiceItem.LLILZLL;
                if (str3.length() != 0 && bulletinVoiceItem.LLJ.length() <= 0) {
                    String str4 = bulletinVoiceItem.LLIZ;
                    if (str4.length() == 0) {
                        str4 = bulletinVoiceItem.LLIZLLLIL;
                    }
                    if (str4.length() != 0 && (bulletinMediaViewModelInvoke = c621210OYd.LIZJ.invoke()) != null && (c2231808om = bulletinMediaViewModelInvoke.LLILZ) != null) {
                        C0VSJ c0vsjLJI = c2231808om.LIZ.LJI(str3, bulletinVoiceItem.LLJIJIL);
                        if (!c0vsjLJI.exists() || c0vsjLJI.length() <= 0) {
                            c2231808om.LIZ(str3, bulletinVoiceItem.LLJIJIL, str4, "expose");
                        }
                    }
                }
            }
        }
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZLLL(bulletinVoiceItem);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(X.C0OVA r15, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r16) {
        /*
            r14 = this;
            r11 = r16
            com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem r11 = (com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem) r11
            r9 = r14
            android.view.View r0 = r9.itemView
            android.content.Context r3 = r0.getContext()
            boolean r2 = r11.LLJJJ
            boolean r1 = r11.LLJJJIL
            android.view.View r0 = r9.itemView
            android.content.Context r0 = r0.getContext()
            boolean r0 = X.C426750GoL.LIZLLL(r0)
            X.0OVA r13 = X.C0OV7.LIZLLL(r3, r2, r1, r0)
            X.19b5 r12 = r9.r6()
            if (r12 == 0) goto L67
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct r0 = r11.LLJJJJLIIL
            r6 = 0
            if (r0 == 0) goto La4
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleBackgroundStruct r0 = r0.backgroundModel
            if (r0 == 0) goto La4
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel r0 = r0.backgroundResourceModel
            r7 = 0
            r1 = 1
            if (r0 == 0) goto La4
            boolean r0 = X.C0OSP.LIZ()
            if (r0 != 0) goto L3e
            boolean r0 = X.C0OSP.LIZIZ()
            if (r0 == 0) goto La4
        L3e:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct r0 = r11.LLJJJJLIIL
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleBackgroundStruct r0 = r0.backgroundModel
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel r0 = r0.backgroundResourceModel
        L48:
            java.lang.String r2 = X.C363301b5.LIZJ(r0)
            if (r2 == 0) goto L6f
            X.0NoK r0 = X.C605100NoK.LIZ
            r0.getClass()
            boolean r0 = X.C605100NoK.LIZJ(r12, r2)
            if (r0 == 0) goto L6f
            X.0OYd r0 = r9.LLJLLL
            if (r0 == 0) goto L60
            r0.LJFF(r11, r1)
        L60:
            X.0OYd r0 = r9.LLJLLL
            if (r0 == 0) goto L67
            r0.LJIIZILJ(r12)
        L67:
            X.0OSi r0 = r9.LLJZ
            if (r0 == 0) goto L6e
            r0.LJI(r11)
        L6e:
            return
        L6f:
            a7(r11, r9, r12, r13)
            java.lang.Long r10 = r11.LLJJIJI
            X.0OYi r8 = new X.0OYi
            r8.<init>()
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct r0 = r11.LLJJJJLIIL
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleBackgroundStruct r0 = r0.backgroundModel
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel r5 = r0.backgroundResourceModel
        L83:
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel r0 = r9.f6()
            X.01wk r4 = r0.getAssemVMScope()
            X.01bz r0 = X.EnumC368901bz.IMAGE
            java.util.List r3 = java.util.Collections.singletonList(r0)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0sYq[] r1 = new X.InterfaceC1631620sYq[r1]
            X.0NoB r0 = new X.0NoB
            r0.<init>(r12, r8, r6)
            r1[r7] = r0
            X.C363301b5.LIZ(r5, r4, r3, r2, r1)
            goto L67
        La0:
            r5 = r6
            goto L83
        La2:
            r0 = r6
            goto L48
        La4:
            a7(r11, r9, r12, r13)
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinVoiceCell.N5(X.0OVA, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem):void");
    }

    public static final void a7(BulletinVoiceItem bulletinVoiceItem, BulletinVoiceCell bulletinVoiceCell, C21568919b5 c21568919b5, C0OVA c0ova) {
        C0OTJ c0otj;
        c21568919b5.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        Context context = c21568919b5.getContext();
        if (bulletinVoiceItem.LLJJJIL) {
            if (bulletinVoiceCell.To()) {
                c0otj = C0OTJ.END;
            } else {
                c0otj = C0OTJ.START;
            }
        } else {
            c0otj = C0OTJ.NONE_MIRROR;
        }
        c21568919b5.setBackground(new C21568519b1(context, c0ova, c0otj, bulletinVoiceCell.To()));
        C621210OYd c621210OYd = bulletinVoiceCell.LLJLLL;
        if (c621210OYd != null) {
            c621210OYd.LJFF(bulletinVoiceItem, false);
        }
        C621210OYd c621210OYd2 = bulletinVoiceCell.LLJLLL;
        if (c621210OYd2 != null) {
            c621210OYd2.LJIIZILJ(c21568919b5);
        }
    }
}
