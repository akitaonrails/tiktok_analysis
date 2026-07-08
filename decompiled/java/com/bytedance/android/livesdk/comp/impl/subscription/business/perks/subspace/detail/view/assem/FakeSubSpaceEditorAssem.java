package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C01GW;
import X.C1322110kVd;
import X.C1324610kZf;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1819620xS4;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C497740JfY;
import X.C504880Jr4;
import X.C506370JtT;
import X.C506720Ju2;
import X.C506730Ju3;
import X.C506740Ju4;
import X.C506790Ju9;
import X.C506820JuC;
import X.C506830JuD;
import X.C506840JuE;
import X.C506850JuF;
import X.C506860JuG;
import X.C506870JuH;
import X.C506920JuM;
import X.C507030JuX;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1142670fqD;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class FakeSubSpaceEditorAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final AssemVMLazy LLJJI;
    public C504880Jr4 LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FakeSubSpaceEditorAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FakeSubSpaceEditorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C506790Ju9(c19719912DlLIZ), new C507030JuX(), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new C506920JuM(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C506830JuD(this));
        this.LLJJIJIL = C452501pT.LIZIZ(new C506820JuC(this));
        this.LLJJJ = C452501pT.LIZIZ(new C506870JuH(this));
        this.LLJJJIL = C452501pT.LIZIZ(new C506850JuF(this));
        this.LLJJJJ = C452501pT.LIZIZ(new C506860JuG(this));
        this.LLJJJJJIL = C452501pT.LIZIZ(new C506840JuE(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hog;
    }

    public final C504880Jr4 hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C504880Jr4.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C504880Jr4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubSpaceDetailVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (SubSpaceDetailVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        User user;
        List urls;
        ImageModel avatarThumb;
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, (View) this.LLJJJJJIL.getValue());
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jtj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506340JtQ) obj).LLILZIL;
            }
        }, null, new C506370JtT(this), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jth
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506340JtQ) obj).LLJILJIL;
            }
        }, C736820SvI.LIZLLL(), new C506730Ju3(this), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JuN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506340JtQ) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new C506740Ju4(this), 4);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JuJ
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                if (view2 != null) {
                    FakeSubSpaceEditorAssem.kp(this.LLILZ, null, 0, 3);
                }
            }
        }, (View) this.LLJJIJIIJIL.getValue());
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JuK
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                if (view2 != null) {
                    FakeSubSpaceEditorAssem.kp(this.LLILZ, null, 1, 1);
                }
            }
        }, (View) this.LLJJJIL.getValue());
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JuL
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                if (view2 != null) {
                    FakeSubSpaceEditorAssem.kp(this.LLILZ, null, 2, 1);
                }
            }
        }, (View) this.LLJJJJ.getValue());
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JuI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506340JtQ) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C506720Ju2(this), 4);
        C504880Jr4 c504880Jr4Hp = hp();
        if (c504880Jr4Hp != null && (user = c504880Jr4Hp.LLJ) != null) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(40.0f);
            ImageModel avatarMedium = user.getAvatarMedium();
            List urls2 = null;
            if (avatarMedium != null) {
                urls2 = avatarMedium.getUrls();
            }
            if (urls2 != null && !urls2.isEmpty()) {
                avatarThumb = user.getAvatarMedium();
            } else {
                ImageModel avatarThumb2 = user.getAvatarThumb();
                if (avatarThumb2 != null && (urls = avatarThumb2.getUrls()) != null && !urls.isEmpty()) {
                    avatarThumb = user.getAvatarThumb();
                }
                ((C1322110kVd) this.LLJJIJIL.getValue()).setActualImageResource(R.drawable.el9);
            }
            if (avatarThumb != null) {
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(avatarThumb.getUrls());
                c1324610kZfLIZJ.LJI = iLIZIZ;
                c1324610kZfLIZJ.LJII = iLIZIZ;
                c1324610kZfLIZJ.LJIIL = new InterfaceC1142670fqD() { // from class: X.0Ju7
                    @Override // X.InterfaceC1142670fqD
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZIZ(Animatable animatable) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZJ(int i, int i2, String str) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZLLL(String str, Exception exc) {
                        C1CC2.LIZ("SubSpaceAvatarLoad", exc);
                        ((C1322110kVd) this.LIZ.LLJJIJIL.getValue()).setActualImageResource(R.drawable.el9);
                    }
                };
                c1324610kZfLIZJ.LJJI((View) this.LLJJIJIL.getValue());
            } else {
                ((C1322110kVd) this.LLJJIJIL.getValue()).setActualImageResource(R.drawable.el9);
            }
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jr6
            {
                super(300L);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
            @Override // X.AbstractViewOnClickListenerC1637610siV
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r10) {
                /*
                    r9 = this;
                    if (r10 == 0) goto L80
                    com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem r0 = r9.LLILZ
                    com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM r8 = r0.ip()
                    android.text.Editable r0 = r8.Mq()
                    if (r0 == 0) goto L71
                    java.lang.String r7 = r0.toString()
                    if (r7 == 0) goto L71
                    X.0Jr4 r0 = r8.vQ2()
                    r6 = 0
                    if (r0 == 0) goto L39
                    java.lang.Long r0 = r0.LLJILJILJ
                    if (r0 == 0) goto L39
                    long r2 = r0.longValue()
                    X.0Jr4 r0 = r8.vQ2()
                    if (r0 == 0) goto L39
                    java.util.HashMap<java.lang.Long, java.util.List<com.bytedance.android.livesdk.chatroom.api.AtWithIndex>> r1 = r0.LLJJ
                    if (r1 == 0) goto L39
                    java.lang.Long r0 = java.lang.Long.valueOf(r2)
                    java.lang.Object r5 = r1.get(r0)
                    java.util.List r5 = (java.util.List) r5
                    if (r5 != 0) goto L3e
                L39:
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                L3e:
                    X.0Jr4 r0 = r8.vQ2()
                    if (r0 == 0) goto L87
                    com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem r4 = r0.LLJJI
                L46:
                    X.0Jr4 r0 = r8.vQ2()
                    if (r0 == 0) goto L71
                    com.bytedance.android.livesdk.chatroom.api.SpacePost r3 = r0.LLILLL
                    if (r3 == 0) goto L71
                    if (r4 == 0) goto L83
                    X.0Jr4 r0 = r8.vQ2()
                    if (r0 == 0) goto L81
                    java.lang.Long r2 = r0.LLJILJILJ
                L5a:
                    long r0 = r4.commentId
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                    if (r0 == 0) goto L83
                    r8.CN1(r4, r7, r5)
                L69:
                    X.0Jr4 r0 = r8.vQ2()
                    if (r0 == 0) goto L71
                    r0.LLJJI = r6
                L71:
                    com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem r0 = r9.LLILZ
                    X.01GW r0 = r0.LLJJIJI
                    java.lang.Object r1 = r0.getValue()
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    java.lang.String r0 = ""
                    r1.setText(r0)
                L80:
                    return
                L81:
                    r2 = r6
                    goto L5a
                L83:
                    r8.FF1(r7, r5, r3)
                    goto L69
                L87:
                    r4 = r6
                    goto L46
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C504900Jr6.LIZ(android.view.View):void");
            }
        }, (View) this.LLJJJ.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void kp(com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem r10, com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem.kp(com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.FakeSubSpaceEditorAssem, com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem, int, int):void");
    }
}
