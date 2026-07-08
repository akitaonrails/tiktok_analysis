package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C01GW;
import X.C0BLB;
import X.C0P0T;
import X.C0TCH;
import X.C1171920gbO;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C197039127h;
import X.C19719912Dl;
import X.C1C7U;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2255108sX;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C295070BhR;
import X.C297350Bl7;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C450720Hlu;
import X.C452501pT;
import X.C629400OmQ;
import X.C629640Omo;
import X.C629780On2;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ACListenerS113S0200000_9;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCollectViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.prefab.FavoriteButtonAssem;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicFavoriteButtonAssem extends FavoriteButtonAssem implements CollectSuccessDialogAbility {
    public static final C629400OmQ LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(257));
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0OmQ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicFavoriteButtonAssem.class, "musicCollectVM", "getMusicCollectVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicCollectViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(MusicFavoriteButtonAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0)};
        LLJLIL = new Object() { // from class: X.0OmQ
        };
    }

    public MusicFavoriteButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicCollectViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1258), AFwS240S0000000_9.get$arr$(529), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicDetailViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1259), AFwS240S0000000_9.get$arr$(530), null, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1257));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1252));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1253));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1255));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1254));
        this.LLJJL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1256));
    }

    public final C629780On2 mp() {
        return (C629780On2) this.LLJJIJI.getValue();
    }

    public final MusicCollectViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (MusicCollectViewModel) assemVMLazy.getValue();
    }

    public final MusicDetailViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (MusicDetailViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem for r7v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        /*
            r7 = this;
            super.onCreate()
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r7)
            if (r0 == 0) goto L1b
            r5 = 0
            X.0Q7z r4 = X.C1558360qeg.LJFF(r0, r5)
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility> r0 = com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility.class
            X.01wD r6 = X.C1558520qew.LIZ(r4, r0, r5)
            if (r6 != 0) goto L1c
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility> r0 = com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility.class
            X.C1558520qew.LJII(r4, r7, r0, r5, r5)
        L1b:
            return
        L1c:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r6)     // Catch: java.lang.IllegalArgumentException -> L34
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L34
            if (r0 == 0) goto L2c
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L34
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L34
            r0.add(r7)     // Catch: java.lang.IllegalArgumentException -> L34
            return
        L2c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L34
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L34
            throw r1     // Catch: java.lang.IllegalArgumentException -> L34
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility> r0 = com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility> r0 = com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility.class
            r2[r1] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r7)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r6)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto L63
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility> r0 = com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility.class
            X.C1558520qew.LJII(r4, r1, r0, r5, r5)
            return
        L63:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem.onCreate():void");
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility
    public final boolean ul1() {
        return mp().LIZ.getBoolean(C629780On2.LIZ("need_show_collect_succed_dialog_%s"), true);
    }

    @Override // com.ss.android.ugc.aweme.prefab.FavoriteButtonAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        C197039127h c197039127hLp = lp();
        if (c197039127hLp != null) {
            c197039127hLp.setTag(R.id.ih9, "font_sync");
        }
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.CollectSuccessDialogAbility
    public final boolean kf2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.prefab.FavoriteButtonAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
        MusicCollectViewModel musicCollectViewModelOp = op();
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, FavoriteAbility.class, null);
        if (interfaceC494301wDLIZ == null) {
            C1558520qew.LJII(interfaceC665370Q7zLJFF, musicCollectViewModelOp, FavoriteAbility.class, null, null);
        } else {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(musicCollectViewModelOp);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(musicCollectViewModelOp);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(FavoriteAbility.class.getClassLoader(), new Class[]{FavoriteAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, FavoriteAbility.class, null, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility");
                }
            }
        }
        C197039127h c197039127hLp = lp();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        c197039127hLp.setBackground(c384050F3z.LIZ(view.getContext()));
        if (Intrinsics.LJFF(String.valueOf(getConfig().LLILZ.get("have_margin")), "true")) {
            C426750GoL.LJIIIZ(lp(), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 16);
        }
        if (C297350Bl7.LIZ()) {
            lp().setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            lp().setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        }
        C786410Ut5.U8(lp(), new ACListenerS113S0200000_9(this, fragmentLJI, 18));
        final Context context = getContext();
        if (context != null && mp().LIZIZ()) {
            HandlerHook.viewPostDelay(getContentView(), new Runnable() { // from class: com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem$tryToShowCollectGuidePopup$1
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                public final void LIZ() {
                    if (this.LL.LLILZ) {
                        try {
                            C450720Hlu c450720Hlu = new C450720Hlu(context);
                            c450720Hlu.LLILLJJLI.LIZLLL = EnumC1235690iGF.BOTTOM;
                            c450720Hlu.LLILLJJLI.LIZIZ = this.LL.getContentView();
                            c450720Hlu.LJIIJ(2131837746);
                            final C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
                            c0p0tLIZIZ.show();
                            Fragment fragmentLJI2 = C724240Sb0.LJI(this.LL);
                            if (fragmentLJI2 != null) {
                                InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJI2, null);
                                PageHeaderScrollAbility pageHeaderScrollAbility = new PageHeaderScrollAbility() { // from class: com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem$tryToShowCollectGuidePopup$1.1
                                    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
                                    public final void bq(int i) {
                                        c0p0tLIZIZ.dismiss();
                                    }
                                };
                                InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLJFF2, PageHeaderScrollAbility.class, null);
                                if (interfaceC494301wDLIZ2 == null) {
                                    C1558520qew.LJII(interfaceC665370Q7zLJFF2, pageHeaderScrollAbility, PageHeaderScrollAbility.class, null, null);
                                    return;
                                }
                                try {
                                    InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(interfaceC494301wDLIZ2);
                                    if (!(invocationHandler2 instanceof C2255108sX)) {
                                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                                    }
                                    ((C2255108sX) invocationHandler2).LL.add(pageHeaderScrollAbility);
                                } catch (IllegalArgumentException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    C2255108sX c2255108sX2 = new C2255108sX();
                                    c2255108sX2.LL.add(pageHeaderScrollAbility);
                                    c2255108sX2.LL.add((T) interfaceC494301wDLIZ2);
                                    Object objNewProxyInstance2 = Proxy.newProxyInstance(PageHeaderScrollAbility.class.getClassLoader(), new Class[]{PageHeaderScrollAbility.class}, c2255108sX2);
                                    if (objNewProxyInstance2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility");
                                    }
                                    C1558520qew.LJII(interfaceC665370Q7zLJFF2, (PageHeaderScrollAbility) objNewProxyInstance2, PageHeaderScrollAbility.class, null, null);
                                }
                            }
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            C2344809Gs.LIZ(e3);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MusicFavoriteButtonAssem@f947.tryToShowCollectGuidePopup$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MusicFavoriteButtonAssem@f947.tryToShowCollectGuidePopup$1");
                }
            }, 300L);
            mp().LIZ.storeBoolean(C629780On2.LIZ("need_show_collect_guide_%s"), false);
            String str = (String) this.LLJJJIL.getValue();
            String str2 = op().LL;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("code", "1");
            c2344009Gk.LJIIIIZZ("business_type", "core");
            c2344009Gk.LJIIIIZZ("enter_from", "single_song");
            c2344009Gk.LJIIIIZZ("author_id", null);
            c2344009Gk.LJIIIIZZ("group_id", str);
            c2344009Gk.LJIIIIZZ("music_id", str2);
            C20684815ws.LJIILLIIL("show_core_fdmt_tooltips", c2344009Gk.LIZ);
        }
        AssemViewModel.asyncSubscribe$default(op(), new C2217381BqS() { // from class: X.0OjU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OG4) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS588S0100000_9(this, 317), null, new AwS375S0200000_9(this, fragmentLJI, 73), 8, null);
        if (!Intrinsics.LJFF(this.LLJJJJ.getValue(), "personal_homepage")) {
            C629780On2 c629780On2Mp = mp();
            c629780On2Mp.getClass();
            if (C0BLB.LIZ() >= 3 && c629780On2Mp.LIZ.getBoolean("key_music_favorite_revisit_guide_dialog", true)) {
                C1171920gbO.LIZ.getClass();
                if (C295070BhR.LIZ()) {
                    C0TCH c0tch = C0TCH.LIZ;
                    C0TCH.LIZ(c0tch, C629640Omo.LIZJ);
                    C0TCH.LIZ(c0tch, C629640Omo.LIZLLL);
                }
            }
        }
    }
}
