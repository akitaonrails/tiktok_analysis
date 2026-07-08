package com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.item;

import X.AbstractC738140SxQ;
import X.C04TK;
import X.C0I0B;
import X.C0PEM;
import X.C0ZE7;
import X.C0ZE8;
import X.C1220000hqw;
import X.C1231704rr;
import X.C13LE;
import X.C13LP;
import X.C1400340mXo;
import X.C1559260qg8;
import X.C19507611Tu;
import X.C19508011Ty;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C19727912Gn;
import X.C19EG;
import X.C20616315lp;
import X.C20616415lq;
import X.C20617915m5;
import X.C20618015m6;
import X.C20618115m7;
import X.C20618315m9;
import X.C20618815mE;
import X.C2188811AlT;
import X.C23250099c;
import X.C376670Epl;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C451610HnL;
import X.C452070Ho5;
import X.C631370Opb;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C814420VxA;
import X.C897370ZIh;
import X.EnumC1910440zoY;
import X.EnumC19358210oO;
import X.EnumC20616515lr;
import X.EnumC20618215m8;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.InterfaceC897380ZIi;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.ContactSelectVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class EditShareSelectReusedUISlot extends ReusedUISlotAssem<EditShareSelectReusedUISlot> implements InterfaceC712990Rxx<C20618015m6> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C19507611Tu.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C19508011Ty.class, null), checkSupervisorPrepared());
    public C427660Gpo LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public C197039127h LLJLL;
    public IDMAvatarLoader LLJLLIL;
    public C19727912Gn LLJLLL;
    public TuxTextView LLJZ;
    public final C736950SvV LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cg7;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final ContactSelectVM sp() {
        return (ContactSelectVM) this.LLJZIJLIL.getValue();
    }

    public EditShareSelectReusedUISlot() {
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 734);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ContactSelectVM.class);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(145);
        this.LLJZIJLIL = new C736950SvV(c19719912DlLIZ, new AwS575S0100000_31(awS575S0100000_31, (Function0<Unit>) 735), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS276S0000000_31, new AwS575S0100000_31((AbstractC738140SxQ) this, 736), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        this.LLJLIL = (C427660Gpo) view.findViewById(R.id.bkz);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.p9j);
        this.LLJLL = (C197039127h) view.findViewById(R.id.up8);
        this.LLJLLL = (C19727912Gn) view.findViewById(R.id.a6g);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.fgz);
        IMAvatarLoaderApi.LIZ.getClass();
        IMAvatarLoaderApi iMAvatarLoaderApi = C04TK.LIZIZ;
        C427660Gpo c427660Gpo = this.LLJLIL;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        this.LLJLLIL = iMAvatarLoaderApi.LIZJ(c427660Gpo, "share_post_2_dm");
        if (C376670Epl.LIZ()) {
            C427660Gpo c427660Gpo2 = this.LLJLIL;
            if (c427660Gpo2 == null) {
                c427660Gpo2 = null;
            }
            ViewGroup.LayoutParams layoutParams = c427660Gpo2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            }
            TuxTextView tuxTextView = this.LLJLILLLLZIIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0263  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C20618015m6 r23) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.item.EditShareSelectReusedUISlot.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C20618015m6 c20618015m6) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C20618015m6 c20618015m6) {
    }

    public final void op(EnumC20616515lr enumC20616515lr, C20618015m6 c20618015m6) {
        int friendCount;
        C20616415lq c20616415lq;
        String str;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        Fragment fragment;
        View view;
        View viewFindFocus;
        User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
        if (currentUser != null) {
            friendCount = currentUser.getFriendCount();
        } else {
            friendCount = 0;
        }
        int size = sp().getState().LL.size();
        Function1<Map<String, String>, Unit> function1 = ((C19508011Ty) this.LLJL.getValue()).LLIZ;
        int i = C20618115m7.LIZIZ[enumC20616515lr.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null && (fragment = (Fragment) C13LP.LJJJLL(listLJJLIIIJL)) != null && (view = fragment.getView()) != null && (viewFindFocus = view.findFocus()) != null) {
                        KeyboardUtils.LIZ(viewFindFocus.getContext(), viewFindFocus);
                    }
                    sp().yQ2(c20618015m6);
                    C20618815mE.LIZJ(sp().LLJI, EnumC19358210oO.CLICK_ON_MESSAGE, sp().LLJ, sp().LLJIJIL, friendCount, size, Integer.valueOf(C631370Opb.LIZIZ(this)), function1, 256);
                } else {
                    throw new C1954807lC();
                }
            } else {
                sp().BQ2(c20618015m6);
                C20618815mE.LIZJ(sp().LLJI, EnumC19358210oO.CLICK_ON_UNDO, sp().LLJ, sp().LLJIJIL, friendCount, size, Integer.valueOf(C631370Opb.LIZIZ(this)), function1, 256);
            }
        } else {
            C20617915m5 c20617915m5 = sp().LL;
            if (c20617915m5 != null) {
                String strLIZ = c20618015m6.LIZ();
                if (strLIZ.length() == 0) {
                    c20617915m5.LIZLLL.LIZIZ();
                } else {
                    synchronized (c20617915m5.LJFF) {
                        try {
                            LinkedHashMap linkedHashMap = (LinkedHashMap) c20617915m5.LJ;
                            Object c20616415lq2 = linkedHashMap.get(strLIZ);
                            if (c20616415lq2 == null) {
                                c20616415lq2 = new C20616415lq(c20617915m5.LIZ, strLIZ, new AwS575S0100000_31(c20617915m5, 1587), c20617915m5.LIZJ, c20617915m5.LIZIZ);
                                linkedHashMap.put(strLIZ, c20616415lq2);
                            }
                            c20616415lq = (C20616415lq) c20616415lq2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (c20616415lq.LJI != EnumC20616515lr.NOT_SEND) {
                        C1231704rr c1231704rr = c20616415lq.LJFF;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("try to send video or photo msg, wrong state, current state is ");
                        sbLIZ.append(c20616415lq.LJI);
                        sbLIZ.append(", contact is ");
                        sbLIZ.append(c20618015m6);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1231704rr.LIZIZ();
                    } else {
                        c20616415lq.LJIIIIZZ = c20618015m6;
                        c20616415lq.LJI = EnumC20616515lr.SENT;
                        c20616415lq.LIZJ.invoke();
                        C1231704rr c1231704rr2 = c20616415lq.LJFF;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("start send video or photo msg to ");
                        sbLIZ2.append(c20618015m6);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c1231704rr2.getClass();
                        c20616415lq.LJII = C23250099c.LIZLLL(c20616415lq.LIZ, C0PEM.LIZ, null, new C20616315lp(c20618015m6, c20616415lq, null), 2);
                    }
                }
            }
            C20618815mE.LIZJ(sp().LLJI, EnumC19358210oO.CLICK_ON_SEND, sp().LLJ, sp().LLJIJIL, friendCount, size, Integer.valueOf(C631370Opb.LIZIZ(this)), function1, 256);
        }
        EnumC20618215m8 enumC20618215m8 = c20618015m6.LL;
        String str2 = c20618015m6.LLILLL;
        if (str2 == null) {
            str2 = "";
        }
        if (enumC20616515lr == EnumC20616515lr.SENT) {
            str = "message_tab";
        } else if (Intrinsics.LJFF(sp().LLJ, "exit_video_shoot_send_to_friends")) {
            str = "exit_video_shoot_send_to_friends";
        } else {
            str = "camera_dm_share_panel";
        }
        boolean z = c20618015m6.LLIZLLLIL;
        String str3 = sp().LLJ;
        int iLIZIZ = C631370Opb.LIZIZ(this);
        InterfaceC897380ZIi.LIZIZ.getClass();
        C0ZE8 c0ze8LJIIJJI = C897370ZIh.LIZ().LJIIJJI();
        C0ZE7 c0ze7 = new C0ZE7(this);
        c0ze7.LIZIZ(EnumC1910440zoY.CAMERA_DM_SHARE_PANEL);
        c0ze7.LJ = str3;
        c0ze7.LJFF = str;
        c0ze7.LJII = Boolean.valueOf(z);
        c0ze7.LJI = Integer.valueOf(iLIZIZ);
        int i2 = C20618315m9.LIZ[enumC20618215m8.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                c0ze7.LJIIIZ = str2;
            } else {
                throw new C1954807lC();
            }
        } else {
            c0ze7.LIZJ = str2;
        }
        c0ze8LJIIJJI.LIZ(c0ze7, false, C0I0B.LJFF.LIZIZ());
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
