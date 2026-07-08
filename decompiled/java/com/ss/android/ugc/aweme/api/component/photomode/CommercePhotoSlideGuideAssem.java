package com.ss.android.ugc.aweme.api.component.photomode;

import X.C01GW;
import X.C098200Yq;
import X.C1017070cZd;
import X.C1022620cia;
import X.C13LE;
import X.C1558520qew;
import X.C15LH;
import X.C1602160rnK;
import X.C189200o6;
import X.C1A5L;
import X.C20749116Hh;
import X.C21599719g3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1019010ccl;
import X.InterfaceC1018980cci;
import X.InterfaceC20688015xO;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoModeAbility;
import com.ss.android.ugc.aweme.commercialize.model.LeftSlideGuideConfig;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class CommercePhotoSlideGuideAssem extends BaseCellContentComponent<CommercePhotoSlideGuideAssem> implements InterfaceC1018980cci {
    public Aweme LLJJL;
    public C21599719g3 LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS276S0000000_31.get$arr$(48));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 221));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 222));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 220));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 223));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 219));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 224));

    @Override // X.InterfaceC1018980cci
    public final void Q4() {
        Unit unit;
        try {
            C21599719g3 c21599719g3 = this.LLJJLIIIJLLLLLLLZ;
            if (c21599719g3 != null) {
                c21599719g3.LJIIL();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void ep() {
        ICommercePhotoModeAbility iCommercePhotoModeAbility;
        if (this.LLJL && (iCommercePhotoModeAbility = (ICommercePhotoModeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommercePhotoModeAbility.class, null)) != null) {
            iCommercePhotoModeAbility.g00();
        }
    }

    public final void ip() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C21599719g3 c21599719g3 = this.LLJJLIIIJLLLLLLLZ;
        if (c21599719g3 == null) {
            return;
        }
        int visibility = c21599719g3.getVisibility();
        c21599719g3.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c21599719g3);
        c21599719g3.setOnPageChangeListener(null);
        ViewParent parent = c21599719g3.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(c21599719g3, viewGroup2);
        }
        View view = (View) this.LLJLIL.getValue();
        if (view == null || Intrinsics.LJFF(view.getParent(), this.LLJLILLLLZIIL.getValue())) {
            return;
        }
        ViewParent parent2 = view.getParent();
        if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
        ViewGroup viewGroup3 = (ViewGroup) this.LLJLILLLLZIIL.getValue();
        if (viewGroup3 != null) {
            viewGroup3.addView(view);
        }
    }

    public final void kp() {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS131S0100000_31(this, 48));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        InterfaceC20688015xO interfaceC20688015xO = (InterfaceC20688015xO) this.LLJLL.getValue();
        if (interfaceC20688015xO != null) {
            interfaceC20688015xO.setGestureInterceptor(null);
        }
        InterfaceC20688015xO interfaceC20688015xO2 = (InterfaceC20688015xO) this.LLJLLIL.getValue();
        if (interfaceC20688015xO2 != null) {
            interfaceC20688015xO2.setGestureInterceptor(null);
        }
        InterfaceC20688015xO interfaceC20688015xO3 = (InterfaceC20688015xO) this.LLJLLL.getValue();
        if (interfaceC20688015xO3 != null) {
            interfaceC20688015xO3.setGestureInterceptor(null);
        }
        ip();
        this.LLJJL = null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        super.oo();
        C1022620cia.LJ("CommercePhotoSlideGuide", "on in active");
    }

    @Override // X.InterfaceC1018980cci
    public final void M3(float f) {
        C21599719g3 c21599719g3 = this.LLJJLIIIJLLLLLLLZ;
        if (c21599719g3 != null) {
            c21599719g3.LJFF();
        }
        C21599719g3 c21599719g32 = this.LLJJLIIIJLLLLLLLZ;
        if (c21599719g32 != null) {
            c21599719g32.LJIILIIL(f);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C21599719g3 c21599719g3 = (C21599719g3) C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d4l, (ViewGroup) view, false).findViewById(R.id.aa9);
        this.LLJJLIIIJLLLLLLLZ = c21599719g3;
        C2271391DvN.LIZ(c21599719g3, (C1A5L) C2271381DvM.LJJIJIIJI.getValue());
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.15xL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS319S0000000_31.get$arr$(5), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.15pO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS319S0000000_31.get$arr$(6), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C21599719g3 c21599719g3;
        ViewGroup viewGroup;
        View view;
        String string;
        LeftSlideGuideConfig leftSlideGuideConfig;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        AwemeRawAd awemeRawAd;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLJJL = videoItemParams2.getAweme();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind: ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" isPhotoModeAdShowLeftGuide:");
        sbLIZ.append(C1017070cZd.LLIILII(videoItemParams2.getAweme()));
        sbLIZ.append(' ');
        Aweme aweme = videoItemParams2.getAweme();
        Long creativeId = null;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            creativeId = awemeRawAd.getCreativeId();
        }
        sbLIZ.append(creativeId);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC20688015xO interfaceC20688015xO = (InterfaceC20688015xO) this.LLJLL.getValue();
        if (interfaceC20688015xO != null) {
            hp(interfaceC20688015xO, EnumC1019010ccl.INTERACTION_LEFT);
        }
        InterfaceC20688015xO interfaceC20688015xO2 = (InterfaceC20688015xO) this.LLJLLIL.getValue();
        if (interfaceC20688015xO2 != null) {
            hp(interfaceC20688015xO2, EnumC1019010ccl.INTERACTION_RIGHT);
        }
        InterfaceC20688015xO interfaceC20688015xO3 = (InterfaceC20688015xO) this.LLJLLL.getValue();
        if (interfaceC20688015xO3 != null) {
            hp(interfaceC20688015xO3, EnumC1019010ccl.INTERACTION_BOTTOM);
        }
        if (C1017070cZd.LLIILII(videoItemParams2.getAweme())) {
            Context context = getContext();
            if (context != null && (c21599719g3 = this.LLJJLIIIJLLLLLLLZ) != null && (viewGroup = (ViewGroup) this.LLJLILLLLZIIL.getValue()) != null && (view = (View) this.LLJLIL.getValue()) != null) {
                C15LH c15lh = new C15LH(context);
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup3);
                }
                ViewParent parent2 = c21599719g3.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                    C786410Ut5.LJJJLZIJ(c21599719g3, viewGroup2);
                }
                int visibility = c21599719g3.getVisibility();
                c21599719g3.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c21599719g3);
                viewGroup.addView(c21599719g3);
                c15lh.LLIZ = view;
                c21599719g3.setOnPageChangeListener(new C20749116Hh(this, c15lh, videoItemParams2, 2));
                AwemeRawAd awemeRawAd2 = videoItemParams2.getAweme().getAwemeRawAd();
                if (awemeRawAd2 == null || (leftSlideGuideConfig = awemeRawAd2.getLeftSlideGuideConfig()) == null || (string = leftSlideGuideConfig.getGuideText()) == null) {
                    string = context.getString(2131836454);
                }
                c15lh.LLJ = string;
                c21599719g3.setAdapter(c15lh);
                return;
            }
            return;
        }
        ip();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp(X.InterfaceC20688015xO r8, final X.EnumC1019010ccl r9) {
        /*
            r7 = this;
            android.content.Context r2 = r7.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.LLJJL
            r6 = 0
            if (r2 == 0) goto L5c
            if (r4 == 0) goto L5c
            boolean r0 = X.C1017070cZd.LLIIL(r4)
            if (r0 == 0) goto L5c
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto L5c
            int[] r1 = X.C1019020ccm.LIZ
            r5 = r9
            int r0 = r5.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L53
            r0 = 2
            if (r1 == r0) goto L4a
            r0 = 3
            if (r1 != r0) goto L37
            X.01GW r0 = X.C2271381DvM.LJJIJL
            java.lang.Object r1 = r0.getValue()
            X.1A5L r1 = (X.C1A5L) r1
        L2f:
            if (r1 == 0) goto L37
            r0 = r8
            android.view.View r0 = (android.view.View) r0
            X.C2271391DvN.LIZ(r0, r1)
        L37:
            boolean r0 = X.C1017070cZd.LLIILII(r4)
            if (r0 == 0) goto L3e
            r6 = r7
        L3e:
            X.0cch r1 = new X.0cch
            r3 = r8
            android.view.View r3 = (android.view.View) r3
            r1.<init>(r2, r3, r4, r5, r6)
            r8.setGestureInterceptor(r1)
            return
        L4a:
            X.01GW r0 = X.C2271381DvM.LJJIJIL
            java.lang.Object r1 = r0.getValue()
            X.1A5L r1 = (X.C1A5L) r1
            goto L2f
        L53:
            X.01GW r0 = X.C2271381DvM.LJJIJIIJIL
            java.lang.Object r1 = r0.getValue()
            X.1A5L r1 = (X.C1A5L) r1
            goto L2f
        L5c:
            r8.setGestureInterceptor(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.component.photomode.CommercePhotoSlideGuideAssem.hp(X.15xO, X.0ccl):void");
    }
}
