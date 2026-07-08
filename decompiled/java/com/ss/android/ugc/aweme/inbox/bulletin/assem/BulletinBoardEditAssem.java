package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09RB;
import X.C0C64;
import X.C0DTR;
import X.C0HTI;
import X.C0I7D;
import X.C0OLW;
import X.C0OM1;
import X.C0OP4;
import X.C0OP5;
import X.C0OPQ;
import X.C0P4L;
import X.C0P4M;
import X.C0P4S;
import X.C0P4W;
import X.C0P4X;
import X.C0VSJ;
import X.C1220000hqw;
import X.C123100dR;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C127A;
import X.C127K;
import X.C12ES;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1388190mED;
import X.C1390920mIc;
import X.C13LE;
import X.C13LQ;
import X.C1559260qg8;
import X.C1618770sE7;
import X.C1637806bA;
import X.C1667580tUq;
import X.C1720106oR;
import X.C1748470vbJ;
import X.C1749190vcT;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C431260Gvc;
import X.C444940Hca;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C618330ONb;
import X.C618340ONc;
import X.C632440OrK;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C770750ULh;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1216650hlX;
import X.EnumC638250P1r;
import X.InterfaceC1255040ilS;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS144S0100000_9;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinEditShowEntrypointCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntryToggle;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardEditAssem extends UIContentAssem implements InterfaceC1255040ilS {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C736950SvV LLJI;
    public C618340ONc LLJIJIL;
    public C618340ONc LLJILJIL;
    public C1748470vbJ LLJILJILJ;
    public TuxTextView LLJILLL;
    public C1748470vbJ LLJJ;
    public TuxTextView LLJJI;
    public C127K LLJJIII;
    public int LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public String LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinBoardEditAssem.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinBoardEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinBoardEditAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinBoardEditViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 268), AFwS240S0000000_9.get$arr$(169), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C0OLW.class, "bulletin_profile_edit_param"), checkSupervisorPrepared());
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 267);
        this.LLJI = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(170), new AwS553S0100000_9((AbstractC738140SxQ) this, 269), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 265));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 266));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(132));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 264));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go() {
        /*
            r5 = this;
            X.0ONc r2 = r5.LLJIJIL
            if (r2 == 0) goto L6c
            X.0ONc r0 = r5.LLJILJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            r4 = 0
            r3 = 0
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel r0 = r5.Lo()
            X.002o r0 = r0.getState()
            X.0ONg r0 = (X.C618380ONg) r0
            boolean r0 = r0.LLILZ
            if (r0 != 0) goto L75
            java.lang.String r1 = r2.LIZIZ
            X.0ONc r0 = r5.LLJILJIL
            if (r0 == 0) goto L73
            java.lang.String r0 = r0.LIZIZ
        L24:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L75
            java.lang.String r1 = r2.LIZJ
            X.0ONc r0 = r5.LLJILJIL
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.LIZJ
        L32:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L75
            r2 = 0
        L39:
            X.0ONc r0 = r5.LLJIJIL
            if (r0 == 0) goto L6f
            java.lang.String r1 = r0.LIZ
        L3f:
            X.0ONc r0 = r5.LLJILJIL
            if (r0 == 0) goto L6d
            java.lang.String r0 = r0.LIZ
        L45:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L69
            X.0ONc r0 = r5.LLJILJIL
            if (r0 == 0) goto L51
            java.lang.String r3 = r0.LIZ
        L51:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 == 0) goto L68
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel r0 = r5.Lo()
            X.002o r0 = r0.getState()
            X.0ONg r0 = (X.C618380ONg) r0
            X.06Xk<java.lang.String> r0 = r0.LL
            boolean r0 = r0 instanceof X.C1623606Xi
            if (r0 == 0) goto L68
            r4 = 1
        L68:
            r2 = r4
        L69:
            r5.So(r2)
        L6c:
            return
        L6d:
            r0 = r3
            goto L45
        L6f:
            r1 = r3
            goto L3f
        L71:
            r0 = r3
            goto L32
        L73:
            r0 = r3
            goto L24
        L75:
            r2 = 1
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardEditAssem.Go():void");
    }

    public final int Ho() {
        return ((Number) this.LLJJJJ.getValue()).intValue();
    }

    public final C0OLW Jo() {
        return (C0OLW) this.LLJ.getValue();
    }

    public final BulletinBoardEditViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (BulletinBoardEditViewModel) assemVMLazy.getValue();
    }

    public final BulletinProfileViewModel Oo() {
        return (BulletinProfileViewModel) this.LLJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        BaseActivity baseActivity;
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (!(c19egLIZ instanceof BaseActivity) || (baseActivity = (BaseActivity) c19egLIZ) == null) {
            return;
        }
        baseActivity.activityConfiguration(new AwS588S0100000_9(this, 109));
    }

    public static Drawable No(Context context) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        return c384050F3z.LIZ(context);
    }

    @Override // X.InterfaceC1255040ilS
    public final void Eb0(AvatarUri avatarUri) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BulletinBoardEditFragment", "onAvatarUploadSuccess()");
    }

    public final void So(boolean z) {
        if (Jo().LL) {
            ((C197039127h) LJJIJL().findViewById(R.id.cym)).setEnabled(z);
        } else {
            ((TuxNavBar) LJJIJL().findViewById(R.id.cz3)).LJJ(new AwS24S0010000_9(z, 0), "edit_button");
        }
    }

    @Override // X.InterfaceC1255040ilS
    public final void dN2(String str) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BulletinBoardEditFragment", "onChooseAvatarSuccess()");
        if (str != null) {
            C1331660kl2.LIZJ().LIZ();
            C427660Gpo.LJIIJJI((C427660Gpo) LJJIJL().findViewById(R.id.cz2), new C0VSJ(str), false, null, null, false, false, null, null, false, null, 1022);
            C618340ONc c618340ONc = this.LLJILJIL;
            if (c618340ONc != null) {
                c618340ONc.LIZJ = str;
            }
            Go();
            Lo().LLJIJIL = str;
        }
    }

    @Override // X.InterfaceC1255040ilS
    public final void hO(Exception exc) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BulletinBoardEditFragment", "onAvatarUploadFailed()");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        C0I7D editText;
        InputFilter[] inputFilterArr;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        super.onViewCreated(view);
        if (Jo().LL) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS553S0100000_9(this, 13));
            c0om1.LJ(c1251150ifB);
            ((TuxNavBar) LJJIJL().findViewById(R.id.cz3)).setNavActions(c0om1);
            ((TuxNavBar) LJJIJL().findViewById(R.id.cz3)).setNavBackground(C1618770sE7.LIZ(R.attr.zn));
            if (Jo().LLILZIL && C123100dR.LIZ(Jo().LLILZ)) {
                Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=social_inbox_bulletin_creator_guidance_page").buildUpon();
                String str = Jo().LLILZ;
                if (str == null) {
                    str = "";
                }
                SmartRouter.buildRoute(getContext(), builderBuildUpon.appendQueryParameter("from_scene", str).appendQueryParameter("enter_from", Jo().LLILZLL).build().toString()).open();
            } else {
                C0OP4.LIZ.getClass();
                if (!C0OP4.LIZ().getBoolean("has_show_intro", false)) {
                    C0OP5.LJI.LJIIL(1, "is_show_half_guide");
                    C0OP4.LIZ().storeBoolean("has_show_intro", true);
                    C770750ULh c770750ULh = new C770750ULh();
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.tp;
                    Context context = getContext();
                    if (context != null) {
                        c770750ULh.LIZ = c0hti.LIZ(context);
                        c770750ULh.LIZLLL = 2;
                        c770750ULh.LJ = C1618770sE7.LIZJ(2131828069);
                        c770750ULh.LJ(new C1667580tUq(R.raw.icon_billboard_ltr, C1618770sE7.LIZJ(2131828066), C1618770sE7.LIZJ(2131828063), null, 8), new C1667580tUq(R.raw.icon_eye_fill, C1618770sE7.LIZJ(2131828067), C1618770sE7.LIZJ(2131828064), null, 8), new C1667580tUq(R.raw.icon_tab_bottom_friends_fill, C1618770sE7.LIZJ(2131828068), C1618770sE7.LIZJ(2131828065), null, 8));
                        c770750ULh.LJIILLIIL = true;
                        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
                        C0P4S c0p4s = new C0P4S(this, 1);
                        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
                        tuxSheet.LLILLJJLI = c0p4s;
                        c770750ULh.LJI(C1618770sE7.LIZJ(2131828062), new AwS588S0100000_9(tuxSheet, 11));
                        Context context2 = getContext();
                        if (context2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                            tuxSheet.show(supportFragmentManager, "BulletinBoardEditFragment");
                            C0OPQ c0opq = C0OPQ.LIZ;
                            String str2 = Jo().LLILZLL;
                            c0opq.getClass();
                            C0OPQ.LJIILLIIL(1, str2, null, null);
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
            if (getContext() != null) {
                Context context3 = getContext();
                if (context3 != null) {
                    C1749190vcT c1749190vcT = new C1749190vcT(context3, null, 6);
                    LinearLayout linearLayout = new LinearLayout(c1749190vcT.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setBackground(No(linearLayout.getContext()));
                    C127K c127k = new C127K(c1749190vcT.getContext(), null, 6);
                    c127k.setTitle(C1618770sE7.LIZJ(2131828032));
                    C127A c127a = new C127A(c127k.getContext());
                    c127a.LJIILLIIL(new C0P4M(this, 0));
                    c127k.setAccessory(c127a);
                    c127k.setInset(EnumC1216650hlX.PADDING_16);
                    c127k.setCellEnabled(false);
                    this.LLJJIII = c127k;
                    linearLayout.addView(c127k);
                    c1749190vcT.setFormField(linearLayout);
                    c1749190vcT.LJII(C1618770sE7.LIZJ(2131828031));
                    c1749190vcT.LJ(C1618770sE7.LIZJ(2131828026));
                    C786410Ut5.W8(c1749190vcT, new View.OnClickListener() { // from class: X.0ONw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C340780DXo.LIZ(view2);
                        }
                    });
                    ((ViewGroup) LJJIJL().findViewById(R.id.d3r)).addView(c1749190vcT);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C12ES.LJIILL(0, LJJIJL().findViewById(R.id.cym));
            C786410Ut5.U8((C197039127h) LJJIJL().findViewById(R.id.cym), new ACListenerS144S0100000_9(this, 13));
            View viewFindViewById = LJJIJL().findViewById(R.id.cym);
            if (viewFindViewById.isAttachedToWindow()) {
                C0OP5.LJI.LJIIJ();
            } else {
                viewFindViewById.addOnAttachStateChangeListener(new C0P4L(viewFindViewById, 0));
            }
        } else {
            C0OM1 c0om12 = new C0OM1();
            C1250300ido c1250300ido = new C1250300ido();
            c1250300ido.LIZJ = C1618770sE7.LIZJ(2131828101);
            c1250300ido.LJ = true;
            c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
            c1250300ido.LIZ(new AwS553S0100000_9(this, 15));
            c0om12.LJ(c1250300ido);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = C1618770sE7.LIZJ(2131828099);
            c0om12.LIZJ = c1250250idj;
            C1250300ido c1250300ido2 = new C1250300ido();
            c1250300ido2.LIZJ = C1618770sE7.LIZJ(2131828100);
            c1250300ido2.LJ = false;
            c1250300ido2.LIZIZ = "edit_button";
            c1250300ido2.LIZLLL = EnumC638250P1r.PRIMARY;
            c1250300ido2.LIZ(new AwS553S0100000_9(this, 16));
            c0om12.LIZIZ(c1250300ido2);
            ((TuxNavBar) LJJIJL().findViewById(R.id.cz3)).setNavActions(c0om12);
            ((TuxNavBar) LJJIJL().findViewById(R.id.cz3)).setNavBackground(C1618770sE7.LIZ(R.attr.bo));
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_profile_resource_entry_setting", true, true)) {
                C0DTR.LIZIZ((View) this.LLJJJ.getValue());
            } else {
                BulletinBoardEditViewModel bulletinBoardEditViewModelLo = Lo();
                List<BulletinBizResourceEntryToggle> list = Oo().LLJJIJIL;
                ArrayList arrayList = new ArrayList();
                bulletinBoardEditViewModelLo.LLJJIJI = list;
                if (list != null) {
                    for (BulletinBizResourceEntryToggle bulletinBizResourceEntryToggle : list) {
                        if (bulletinBizResourceEntryToggle != null) {
                            arrayList.add(bulletinBizResourceEntryToggle.copy(bulletinBizResourceEntryToggle.type, bulletinBizResourceEntryToggle.name, bulletinBizResourceEntryToggle.status, bulletinBizResourceEntryToggle.iconUrlModel, bulletinBizResourceEntryToggle.extra));
                        }
                    }
                }
                bulletinBoardEditViewModelLo.setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 530));
                C12ES.LJIILL(0, (View) this.LLJJJ.getValue());
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJIL.getValue();
                viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext());
                linearLayoutManager.setOrientation(1);
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(BulletinEditShowEntrypointCell.class);
                C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ONk
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C618380ONg) obj).LLILLL;
                    }
                }, null, new AwS623S0100000_9(this, 4), 6);
            }
        }
        TextView textView = (TextView) LJJIJL().findViewById(R.id.cyk);
        textView.setMovementMethod(C431260Gvc.LIZ);
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ = C1618770sE7.LIZJ(2131828024);
        c444940Hca.LIZIZ = false;
        c444940Hca.LIZIZ(102);
        c444940Hca.LIZLLL(5);
        c444940Hca.LJIIIIZZ = new AwS553S0100000_9(this, 19);
        textView.setText(c444940Hca.LIZ(textView.getContext()));
        C1749190vcT c1749190vcT2 = (C1749190vcT) LJJIJL().findViewById(R.id.cz9);
        LinearLayout linearLayout2 = new LinearLayout(c1749190vcT2.getContext());
        linearLayout2.setOrientation(1);
        C1748470vbJ c1748470vbJ = new C1748470vbJ(c1749190vcT2.getContext(), null, 6);
        c1748470vbJ.LJIIJ(C1618770sE7.LIZJ(2131828028));
        c1748470vbJ.LJIIIIZZ(Ho());
        c1748470vbJ.LLIZLLLIL = Ho();
        c1748470vbJ.setBackground(No(c1748470vbJ.getContext()));
        c1748470vbJ.LIZJ();
        C0DTR.LIZIZ(c1748470vbJ.findViewById(R.id.uqb));
        c1748470vbJ.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        c1748470vbJ.LIZIZ(new C0P4W(this, c1748470vbJ, 0));
        c1748470vbJ.getEditText().setOnTouchListener(new View.OnTouchListener() { // from class: X.0ONs
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent != null && (motionEvent.getAction() == 0 || motionEvent.getAction() == 2)) {
                    C0OP5.LJI.LJIIJJI("title");
                }
                return false;
            }
        });
        this.LLJILJILJ = c1748470vbJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1618770sE7.LIZJ(2131828027));
        sbLIZ.append(" *");
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, c1749190vcT2.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), spannableString.length() - 1, spannableString.length(), 17);
        c1749190vcT2.LJII(spannableString);
        TuxTextView tuxTextView = new TuxTextView(c1749190vcT2.getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new ViewGroup.MarginLayoutParams(-1, -2));
        tuxTextView.setTextAlignment(6);
        C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColor(C1618770sE7.LIZ(R.attr.a1k));
        this.LLJILLL = tuxTextView;
        linearLayout2.addView(this.LLJILJILJ);
        linearLayout2.addView(this.LLJILLL);
        c1749190vcT2.setFormField(linearLayout2);
        C1748470vbJ c1748470vbJ2 = this.LLJILJILJ;
        if (c1748470vbJ2 != null) {
            c1748470vbJ2.LIZLLL(false);
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ONm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C618380ONg) obj).LLILZ);
            }
        }, null, new AwS623S0100000_9(this, 7), 6);
        AssemViewModel.asyncSubscribe$default(Lo(), new C2217381BqS() { // from class: X.0ONn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618380ONg) obj).LL;
            }
        }, null, new AwS375S0200000_9(this, c1749190vcT2, 3), new AwS553S0100000_9(this, 20), new AwS588S0100000_9(this, 17), 2, null);
        C786410Ut5.W8(c1749190vcT2, new View.OnClickListener() { // from class: X.0ONx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C340780DXo.LIZ(view2);
            }
        });
        C1749190vcT c1749190vcT3 = (C1749190vcT) LJJIJL().findViewById(R.id.cz4);
        LinearLayout linearLayout3 = new LinearLayout(c1749190vcT3.getContext());
        linearLayout3.setOrientation(1);
        C1748470vbJ c1748470vbJ3 = new C1748470vbJ(c1749190vcT3.getContext(), null, 6);
        c1748470vbJ3.LJIIJ(C1618770sE7.LIZJ(2131828030));
        c1748470vbJ3.LJIIIIZZ(160);
        c1748470vbJ3.LLIZLLLIL = 160;
        c1748470vbJ3.LL.setLines(5);
        c1748470vbJ3.LJIIIZ(5);
        c1748470vbJ3.setBackground(No(c1748470vbJ3.getContext()));
        C0DTR.LIZIZ(c1748470vbJ3.findViewById(R.id.uqb));
        c1748470vbJ3.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        c1748470vbJ3.LJFF(false);
        c1748470vbJ3.LIZIZ(new C0P4X(this, 0));
        C0I7D editText2 = c1748470vbJ3.getEditText();
        final AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 23);
        if (editText2 != null) {
            if (editText2.getFilters().length == 0) {
                inputFilterArr = new C632440OrK[]{new InputFilter(awS553S0100000_9) { // from class: X.0OrK
                    public final int LL = 4;
                    public final Function0<Unit> LLILLJJLI;

                    {
                        this.LLILLJJLI = awS553S0100000_9;
                    }

                    @Override // android.text.InputFilter
                    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                        int length = spanned.length();
                        int i5 = 0;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (spanned.charAt(i6) == '\n') {
                                i5++;
                            }
                        }
                        while (i < i2) {
                            if (charSequence.charAt(i) == '\n') {
                                if (i5 >= this.LL) {
                                    Function0<Unit> function0 = this.LLILLJJLI;
                                    if (function0 != null) {
                                        function0.invoke();
                                        return "";
                                    }
                                    return "";
                                }
                                i5++;
                            }
                            i++;
                        }
                        return null;
                    }
                }};
            } else {
                inputFilterArr = (InputFilter[]) C09RB.LJJII(C09RB.LJIJJLI(C09RB.LJIIIZ(C13LQ.LJIIJJI(editText2.getFilters()), AFwS240S0000000_9.get$arr$(915)), new InputFilter(awS553S0100000_9) { // from class: X.0OrK
                    public final int LL = 4;
                    public final Function0<Unit> LLILLJJLI;

                    {
                        this.LLILLJJLI = awS553S0100000_9;
                    }

                    @Override // android.text.InputFilter
                    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                        int length = spanned.length();
                        int i5 = 0;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (spanned.charAt(i6) == '\n') {
                                i5++;
                            }
                        }
                        while (i < i2) {
                            if (charSequence.charAt(i) == '\n') {
                                if (i5 >= this.LL) {
                                    Function0<Unit> function0 = this.LLILLJJLI;
                                    if (function0 != null) {
                                        function0.invoke();
                                        return "";
                                    }
                                    return "";
                                }
                                i5++;
                            }
                            i++;
                        }
                        return null;
                    }
                })).toArray(new InputFilter[0]);
            }
            editText2.setFilters(inputFilterArr);
        }
        this.LLJJ = c1748470vbJ3;
        C0I7D editText3 = c1748470vbJ3.getEditText();
        if (editText3 != null) {
            editText3.setNestedScrollingEnabled(true);
        }
        C1748470vbJ c1748470vbJ4 = this.LLJJ;
        if (c1748470vbJ4 != null && (editText = c1748470vbJ4.getEditText()) != null) {
            editText.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ONr
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    ViewParent parent;
                    if (motionEvent != null) {
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (parent = view2.getParent()) != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else {
                            C0OP5.LJI.LJIIJJI("description");
                            ViewParent parent2 = view2.getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                                return false;
                            }
                        }
                    }
                    return false;
                }
            });
        }
        c1749190vcT3.LJII(C1618770sE7.LIZJ(2131828029));
        TuxTextView tuxTextView2 = new TuxTextView(c1749190vcT3.getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView2, new ViewGroup.MarginLayoutParams(-1, -2));
        tuxTextView2.setTextAlignment(6);
        C426750GoL.LJIIIZ(tuxTextView2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
        tuxTextView2.setTuxFont(61);
        tuxTextView2.setTextColor(C1618770sE7.LIZ(R.attr.a1k));
        this.LLJJI = tuxTextView2;
        linearLayout3.addView(this.LLJJ);
        linearLayout3.addView(this.LLJJI);
        c1749190vcT3.setFormField(linearLayout3);
        C1748470vbJ c1748470vbJ5 = this.LLJJ;
        if (c1748470vbJ5 != null) {
            c1748470vbJ5.LIZLLL(false);
        }
        C786410Ut5.W8(c1749190vcT3, new View.OnClickListener() { // from class: X.0ONy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C340780DXo.LIZ(view2);
            }
        });
        LinearLayout linearLayout4 = (LinearLayout) LJJIJL().findViewById(R.id.cz6);
        if (linearLayout4 != null) {
            C786410Ut5.R7(linearLayout4, new View.OnClickListener() { // from class: X.0ONz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C340780DXo.LIZ(view2);
                }
            });
        }
        C786410Ut5.T8((C427660Gpo) LJJIJL().findViewById(R.id.cz2), new ACListenerS144S0100000_9(this, 7));
        this.LLJJIJI = 0;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C618330ONb(this, null), 3);
        AssemViewModel.asyncSubscribe$default(Lo(), new C2217381BqS() { // from class: X.0OLX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618380ONg) obj).LLILLJJLI;
            }
        }, this, null, new AwS588S0100000_9(this, 110), null, new AwS588S0100000_9(this, 111), 20, null);
    }
}
