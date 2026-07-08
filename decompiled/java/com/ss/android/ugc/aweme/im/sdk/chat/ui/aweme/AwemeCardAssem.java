package com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme;

import X.AbstractC1711506n3;
import X.AbstractC2238408pq;
import X.C019F;
import X.C01GW;
import X.C06QY;
import X.C09R3;
import X.C0H0X;
import X.C0H0Z;
import X.C0I0B;
import X.C0I3J;
import X.C0I6Y;
import X.C0IBW;
import X.C0IBX;
import X.C0PEM;
import X.C0QSJ;
import X.C0Z6A;
import X.C0ZR4;
import X.C0ZR5;
import X.C0ZTJ;
import X.C0ZYK;
import X.C0ZYL;
import X.C0ZYO;
import X.C127G;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1378990lzN;
import X.C13LE;
import X.C1400340mXo;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1661306ex;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C327170Cs7;
import X.C327280CsI;
import X.C327350CsP;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C438710HIf;
import X.C451040HmQ;
import X.C452501pT;
import X.C457780HxI;
import X.C459280Hzi;
import X.C461250I6x;
import X.C461530I7z;
import X.C687700QyG;
import X.C723580SZw;
import X.C723590SZx;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729540SjY;
import X.C786410Ut5;
import X.C823170WQx;
import X.C869590Y9l;
import X.C897460ZIq;
import X.C898900ZOe;
import X.C900770ZVj;
import X.C902260ZaS;
import X.C902500Zaq;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.InterfaceC911210Zot;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import Y.ACListenerS149S0100000_14;
import Y.AObjectS67S0000000_14;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryCreationFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMAwemeCardHostBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutCL;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public class AwemeCardAssem extends ReusedUISlotAssem<AwemeCardAssem> implements InterfaceC712990Rxx<C0ZR4>, InterfaceC497601wk, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILLL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final String LLLIILIL;
    public final C902500Zaq LLLIL;
    public C0ZYO LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final AssemVMLazy LLLJ;
    public final C01GW LLLJIL;
    public final AbstractC2238408pq LLLJL;
    public C0ZYL LLLL;
    public volatile InterfaceC911210Zot LLLLII;
    public C127G LLLLIIIILLL;
    public InterfaceC665370Q7z LLLLIIL;
    public C0QSJ LLLLIILL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AwemeCardAssem.class, "messageListFMPTracker", "getMessageListFMPTracker()Lcom/ss/android/ugc/aweme/im/messagelist/perf/IMMessageListFMPTracker;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AwemeCardAssem.class, "availabilityViewModel", "getAvailabilityViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/IAwemeStatusViewModel;", 0);
        c09r3.getClass();
        LLLLIILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public AwemeCardAssem() {
        checkSupervisorPrepared();
        new C723590SZx(this, C898900ZOe.class, null);
        this.LLJL = C1509305vX.LIZ(new AwS558S0100000_14(this, 694));
        checkSupervisorPrepared();
        new C723580SZw(this, C1661306ex.class, null);
        this.LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 702));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 697));
        this.LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 704));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 703));
        this.LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 684));
        this.LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 698));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 690));
        this.LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 695));
        this.LLLF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 696));
        this.LLLFF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 705));
        this.LLLFFI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 699));
        this.LLLFZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
        this.LLLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 688));
        this.LLLII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 686));
        this.LLLIIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 689));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 693));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 683));
        this.LLLIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 692));
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        this.LLLIILIL = curUserId == null ? "" : curUserId;
        this.LLLIL = new C902500Zaq();
        this.LLLILZJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 685));
        this.LLLILZLLLI = C1509305vX.LIZ(new AwS558S0100000_14(this, 687));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 691));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IAwemeStatusViewModel.class);
        this.LLLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 706), AFwS248S0000000_14.get$arr$(172), null, true);
        this.LLLJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 701));
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLLJL = C2107308Nj.LIZ;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cey;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final ViewGroup Bp() {
        return (ViewGroup) this.LLLI.getValue();
    }

    public final TuxTextView Ep() {
        return (TuxTextView) this.LLLF.getValue();
    }

    public final C197039127h Fp() {
        return (C197039127h) this.LLJZ.getValue();
    }

    public final AwemeCardTemplate Gp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C0ZR4) (c724270Sb3 != null ? c724270Sb3.LL : null)).getContent();
    }

    public final RoundingCornerLayoutCL Jp() {
        return (RoundingCornerLayoutCL) this.LLJLIL.getValue();
    }

    public final TuxSpinner Qp() {
        return (TuxSpinner) this.LLJLLIL.getValue();
    }

    public final SessionInfo Tp() {
        return ((C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue()).LL;
    }

    public final void Up() {
        C786410Ut5.LJLLLLLL(8, (View) this.LLJZIJLIL.getValue());
        C786410Ut5.LJLLLLLL(8, Bp());
    }

    public final Aweme Ip() {
        VideoCoverComponent videoCoverComponent;
        String str;
        VideoCoverComponent videoCoverComponent2;
        Aweme aweme;
        AwemeCardTemplate awemeCardTemplateGp = Gp();
        String str2 = null;
        if (awemeCardTemplateGp != null && (videoCoverComponent = awemeCardTemplateGp.baseVideoComponent) != null && (str = videoCoverComponent.id) != null) {
            C327170Cs7 c327170Cs7LIZJ = C327280CsI.LIZJ.LIZJ(str);
            if (c327170Cs7LIZJ != null && (aweme = c327170Cs7LIZJ.LIZIZ) != null) {
                return aweme;
            }
            IMAwemeService.LIZ.getClass();
            IMAwemeService iMAwemeServiceLIZ = C327350CsP.LIZ();
            if (iMAwemeServiceLIZ != null) {
                AwemeCardTemplate awemeCardTemplateGp2 = Gp();
                if (awemeCardTemplateGp2 != null && (videoCoverComponent2 = awemeCardTemplateGp2.baseVideoComponent) != null) {
                    str2 = videoCoverComponent2.id;
                }
                return iMAwemeServiceLIZ.LLILZ(str2);
            }
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        TuxSpinner tuxSpinnerQp = Qp();
        if (tuxSpinnerQp != null) {
            C786410Ut5.LLZILL(tuxSpinnerQp, 8);
        }
    }

    public final void dq() {
        CharSequence text = LJJIJL().getContext().getText(2131832032);
        ((TuxIconView) this.LLLFFI.getValue()).setIconRes(R.raw.icon_large_protection);
        ((TuxIconView) this.LLLFFI.getValue()).setTintColorRes(R.attr.ee);
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LLLFFI.getValue(), 0);
        ((TextView) this.LLLFZ.getValue()).setText(text);
        ((TuxTextView) this.LLLFZ.getValue()).setTextColorRes(R.attr.ee);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLLFZ.getValue(), 0);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLLIIIILLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLLIIIILLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IAwemeStatusViewModel.class, new AObjectS67S0000000_14(this, 25)}, defaultViewModelProviderFactory);
                    this.LLLLIIIILLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        TuxSpinner tuxSpinnerQp = Qp();
        if (tuxSpinnerQp != null) {
            C786410Ut5.LLZILL(tuxSpinnerQp, 8);
        }
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLLJL;
    }

    public static ImageUrlModel fq(ImageComponent imageComponent) {
        UrlModel urlModelLIZ;
        List<String> list;
        if (imageComponent != null && (list = imageComponent.urls) != null) {
            urlModelLIZ = C0I3J.LIZ(list);
        } else {
            urlModelLIZ = null;
        }
        return C438710HIf.LIZ(urlModelLIZ);
    }

    public static boolean tp(AwemeCardTemplate awemeCardTemplate) {
        String strLIZIZ;
        IMAIRemixBridgeApi iMAIRemixBridgeApiLIZ;
        if (awemeCardTemplate != null) {
            strLIZIZ = C902260ZaS.LIZIZ(awemeCardTemplate);
        } else {
            strLIZIZ = null;
        }
        if (strLIZIZ == null || strLIZIZ.length() == 0) {
            return false;
        }
        IMAIRemixBridgeApi.LIZ.getClass();
        IMAIRemixBridgeApi iMAIRemixBridgeApiLIZ2 = C0H0Z.LIZ();
        if (iMAIRemixBridgeApiLIZ2 != null && iMAIRemixBridgeApiLIZ2.LJI() && (iMAIRemixBridgeApiLIZ = C0H0Z.LIZ()) != null && iMAIRemixBridgeApiLIZ.LIZLLL()) {
            return true;
        }
        return false;
    }

    public final void Ap(AwemeCardTemplate awemeCardTemplate) {
        C19EG activity;
        IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ;
        String strLIZIZ;
        Up();
        Fragment fragment = (Fragment) this.LLLJIL.getValue();
        if (fragment != null && (activity = fragment.getActivity()) != null && (iMMediaServiceInternalBridgeLIZ = IMMediaServiceInternalBridge.LIZ.LIZ()) != null) {
            SessionInfo sessionInfoTp = Tp();
            if (awemeCardTemplate != null) {
                strLIZIZ = C0ZTJ.LIZIZ(awemeCardTemplate);
            } else {
                strLIZIZ = null;
            }
            C0IBX c0ibxLIZJ = iMMediaServiceInternalBridgeLIZ.LIZJ(activity, sessionInfoTp, strLIZIZ);
            if (c0ibxLIZJ != null) {
                C0IBW c0ibw = C0IBW.LIZ;
                C197039127h c197039127hFp = Fp();
                c0ibw.getClass();
                C0IBW.LIZLLL(c197039127hFp, c0ibxLIZJ);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Wp, reason: merged with bridge method [inline-methods] */
    public final void up(C0ZR4 c0zr4) {
        C869590Y9l c869590Y9l = c0zr4.LLILII().LIZ.LIZ;
        AwemeCardTemplate awemeCardTemplateGp = Gp();
        if (awemeCardTemplateGp != null) {
            Vp(c869590Y9l, awemeCardTemplateGp);
            Jp().setRoundingParams(c0zr4.LIZJ().LIZ);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void aq(int i) {
        int iIntValue;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        Integer numLIZ = C451040HmQ.LIZ(i, LJJIJL().getContext());
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -16776961;
        }
        paint.setColor(iIntValue);
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(Uri.EMPTY);
        c1331670kl3LJI.LJJIIZI(shapeDrawable);
        c1331670kl3LJI.LJIL(shapeDrawable);
        SmartImageView smartImageView = (SmartImageView) this.LLJLILLLLZIIL.getValue();
        if (smartImageView == null) {
            return;
        }
        c1331670kl3LJI.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJI);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        Drawable background;
        this.LLJJLIIIJLLLLLLLZ.getValue();
        View view2 = (View) this.LLLIIIIL.getValue();
        if (view2 != null && (background = view2.getBackground()) != null) {
            background.setAutoMirrored(true);
        }
        TuxSpinner tuxSpinnerQp = Qp();
        if (tuxSpinnerQp != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ne, LJJIJL().getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxSpinnerQp.LIZ(R.raw.icon_spinner_normal, iIntValue);
        }
        Fp().LJJJJL(AFwS248S0000000_14.get$arr$(173));
        C1378990lzN.LIZIZ(Fp(), Float.valueOf(C418440Gaw.LIZIZ(10)), null, null, null, null, 30);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913860ZtA(this, 5));
        Ep().LJJJJI(12.0f);
        C786410Ut5.Na(Jp(), new ACListenerS149S0100000_14(this, 86));
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1657);
        C786410Ut5.T8((C427660Gpo) this.LLL.getValue(), new ACListenerS149S0100000_14(awS558S0100000_14, 87));
        C786410Ut5.h9(Ep(), new ACListenerS149S0100000_14(awS558S0100000_14, 88));
        C786410Ut5.K7(Bp(), new ACListenerS149S0100000_14(this, 89));
    }

    public final void op(String str) {
        Object obj;
        boolean z;
        C786410Ut5.LJLLLLLL(8, (View) this.LLJZIJLIL.getValue());
        C786410Ut5.LJLLLLLL(8, Bp());
        Aweme awemeIp = Ip();
        if (awemeIp != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            C729540SjY c729540SjYLJ = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            long msgId = C0I6Y.LIZ((InterfaceC461380I7k) obj).getMsgId();
            C823170WQx<Long> c823170WQx = C0Z6A.LIZ;
            if (c823170WQx.contains(Long.valueOf(msgId))) {
                z = false;
            } else {
                c823170WQx.add(Long.valueOf(msgId));
                z = true;
            }
            IMAwemeCardHostBridge.LIZ.getClass();
            IMAwemeCardHostBridge value = C461250I6x.LIZIZ.getValue();
            if (value != null) {
                c729540SjYLJ = value.LJ(LJJIJL().getContext(), awemeIp, str, this.LLLIILIL, z);
            }
            if ((c729540SjYLJ instanceof C0IBX) && c729540SjYLJ != null) {
                C0IBW c0ibw = C0IBW.LIZ;
                C197039127h c197039127hFp = Fp();
                c0ibw.getClass();
                C0IBW.LIZLLL(c197039127hFp, c729540SjYLJ);
            }
        }
    }

    public final void up(C0ZYK c0zyk) {
        Integer numValueOf = Integer.valueOf(c0zyk.LL);
        int i = 0;
        if (numValueOf.intValue() != -1) {
            Ep().setTextColorRes(numValueOf.intValue());
        }
        C786410Ut5.LJLLLLLL(0, (View) this.LLLIIIIL.getValue());
        View view = (View) this.LLLIIL.getValue();
        if (!c0zyk.LLILLJJLI) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZR4 c0zr4) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZR4 c0zr4) {
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vp(X.C869590Y9l r27, com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate r28) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem.Vp(X.0Y9l, com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate):void");
    }

    public final boolean sp(C869590Y9l c869590Y9l, String str) {
        if (str == null || c869590Y9l.isSelf(CastLongProtector.parseLong(str))) {
            return false;
        }
        C06QY c06qy = StoryCreationFeature.LIZ;
        c06qy.getClass();
        StoryCreationFeature value = C06QY.LIZJ.getValue(c06qy, C06QY.LIZIZ[0]);
        if (value == null || !value.LIZIZ(Ip(), str)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ZR5 c0zr5;
        C0ZR4 c0zr4 = (C0ZR4) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C0ZR5) && (c0zr5 = (C0ZR5) obj2) != null) {
                    if (c0zr5.LIZ) {
                        C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ(c0zr4);
                        AwemeCardTemplate awemeCardTemplateGp = Gp();
                        if (awemeCardTemplateGp != null) {
                            Vp(c869590Y9lLIZ, awemeCardTemplateGp);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    if (c0zr5.LIZIZ) {
                        Jp().setRoundingParams(c0zr4.LIZJ().LIZ);
                    }
                }
            }
            return;
        }
        up(c0zr4);
    }

    public final void yp(C869590Y9l c869590Y9l, AwemeCardTemplate awemeCardTemplate) {
        String str;
        String strLIZIZ;
        Up();
        Fragment fragmentLIZ = C897460ZIq.LIZ(LJJIJL());
        if (fragmentLIZ == null) {
            return;
        }
        if (c869590Y9l.getConversationType() == AbstractC1711506n3.LIZIZ) {
            str = "group_chat";
        } else {
            str = "chat";
        }
        Context context = LJJIJL().getContext();
        Tp();
        if (awemeCardTemplate == null || (strLIZIZ = C902260ZaS.LIZIZ(awemeCardTemplate)) == null) {
            strLIZIZ = "";
        }
        C0H0X c0h0x = new C0H0X(context, fragmentLIZ, strLIZIZ, str);
        C0IBW c0ibw = C0IBW.LIZ;
        C197039127h c197039127hFp = Fp();
        c0ibw.getClass();
        C0IBW.LIZLLL(c197039127hFp, c0h0x);
    }

    public final void zp(C869590Y9l c869590Y9l, AwemeCardTemplate awemeCardTemplate) {
        String strLIZ;
        Up();
        Fragment fragmentLIZ = C897460ZIq.LIZ(LJJIJL());
        if (fragmentLIZ == null) {
            return;
        }
        Context context = LJJIJL().getContext();
        TryEffectMobViewModel tryEffectMobViewModelLIZ = C900770ZVj.LIZ(fragmentLIZ);
        SessionInfo sessionInfoTp = Tp();
        if (awemeCardTemplate == null || (strLIZ = C902260ZaS.LIZ(awemeCardTemplate)) == null) {
            strLIZ = "";
        }
        C459280Hzi c459280Hzi = new C459280Hzi(context, fragmentLIZ, tryEffectMobViewModelLIZ, c869590Y9l, sessionInfoTp, strLIZ);
        C0IBW c0ibw = C0IBW.LIZ;
        C197039127h c197039127hFp = Fp();
        c0ibw.getClass();
        C0IBW.LIZLLL(c197039127hFp, c459280Hzi);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Xp(X.C869590Y9l r10, com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem r11, android.graphics.drawable.ShapeDrawable r12, boolean r13, java.lang.String r14, X.AbstractC1335900krs r15, com.ss.android.ugc.aweme.base.ImageUrlModel r16) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem.Xp(X.0Y9l, com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem, android.graphics.drawable.ShapeDrawable, boolean, java.lang.String, X.0krs, com.ss.android.ugc.aweme.base.ImageUrlModel):void");
    }
}
