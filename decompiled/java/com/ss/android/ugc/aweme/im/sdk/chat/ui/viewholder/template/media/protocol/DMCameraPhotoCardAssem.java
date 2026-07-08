package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C01GW;
import X.C03H5;
import X.C0I6Y;
import X.C0QSJ;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1509305vX;
import X.C1558520qew;
import X.C1559260qg8;
import X.C2217381BqS;
import X.C2242281CpW;
import X.C457780HxI;
import X.C461530I7z;
import X.C462590ICb;
import X.C462620ICe;
import X.C462630ICf;
import X.C687700QyG;
import X.C723590SZx;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C896400ZEo;
import X.C901890ZZr;
import X.C902260ZaS;
import X.C902500Zaq;
import X.C911140Zom;
import X.C911320Zp4;
import X.C912070ZqH;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.InterfaceC911100Zoi;
import X.InterfaceC911210Zot;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import Y.ACListenerS149S0100000_14;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageOnScreenAnalyticsAbility;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public abstract class DMCameraPhotoCardAssem<T extends InterfaceC911100Zoi, RECEIVER extends C03H5> extends ReusedUISlotAssem<RECEIVER> implements InterfaceC712990Rxx<T>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJJLIIIJLLLLLLLZ = C1509305vX.LIZ(new AwS558S0100000_14((DMCameraPhotoCardAssem) this, 967));
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJLIL = C1509305vX.LIZ(new AwS558S0100000_14((DMCameraPhotoCardAssem) this, 968));
    public final C902500Zaq LLJLILLLLZIIL = new C902500Zaq();
    public volatile InterfaceC911210Zot LLJLL;
    public InterfaceC665370Q7z LLJLLIL;
    public C0QSJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DMCameraPhotoCardAssem.class, "messageListFMPTracker", "getMessageListFMPTracker()Lcom/ss/android/ugc/aweme/im/messagelist/perf/IMMessageListFMPTracker;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cl1;
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
    public void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public C901890ZZr Ap() {
        return (C901890ZZr) this.LLJLIL.getValue();
    }

    public final InterfaceC911210Zot up() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJLLL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLLIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJLLIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLJLLL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC911210Zot interfaceC911210Zot = (InterfaceC911210Zot) c0qsjLIZLLL.getAbility(InterfaceC911210Zot.class);
        C687700QyG.LJ(interfaceC911210Zot, InterfaceC911210Zot.class);
        return interfaceC911210Zot;
    }

    public final C457780HxI yp() {
        return (C457780HxI) this.LLJL.getValue();
    }

    public final C869590Y9l zp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null));
    }

    public final boolean tp() {
        MessageOnScreenAnalyticsAbility messageOnScreenAnalyticsAbility;
        Boolean boolValueOf;
        C869590Y9l c869590Y9lZp = zp();
        if (c869590Y9lZp == null || (messageOnScreenAnalyticsAbility = (MessageOnScreenAnalyticsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MessageOnScreenAnalyticsAbility.class, null)) == null || (boolValueOf = Boolean.valueOf(messageOnScreenAnalyticsAbility.A41(c869590Y9lZp.getUuid()))) == null) {
            return false;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        int iIntValue;
        View viewFindViewById = getContentView().findViewById(R.id.evm);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS149S0100000_14(this, 66), viewFindViewById);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913860ZtA(this, 8));
            TuxSpinner tuxSpinner = (TuxSpinner) view.findViewById(R.id.nnd);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ne, LJJIJL().getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxSpinner.LIZ(R.raw.icon_spinner_normal, iIntValue);
            return;
        }
        "content layout must be found".toString();
        throw new IllegalStateException("content layout must be found");
    }

    public final void op(C462620ICe c462620ICe) {
        int i;
        C462630ICf c462630ICf = c462620ICe.LIZ;
        Ap().getClass();
        ((RoundingCornerLayout) this.LLJJLIIIJLLLLLLLZ.getValue()).setRoundingParams(c462630ICf);
        getContentView().setBackground(C462590ICb.LIZIZ(c462620ICe, getContentView()));
        Drawable background = getContentView().getBackground();
        if (Ap().LLJILJIL) {
            i = 0;
        } else {
            i = 255;
        }
        background.setAlpha(i);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        InterfaceC911100Zoi interfaceC911100Zoi = (InterfaceC911100Zoi) obj;
        sp(interfaceC911100Zoi);
        op(interfaceC911100Zoi.LIZJ());
    }

    public final void sp(InterfaceC911100Zoi interfaceC911100Zoi) {
        Object obj;
        ImageComponent imageComponent;
        Object obj2;
        PictureCardTemplate content = interfaceC911100Zoi.getContent();
        if (content == null) {
            return;
        }
        this.LLJLILLLLZIIL.LIZJ(zp(), "photo");
        C901890ZZr c901890ZZrAp = Ap();
        C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
        c901890ZZrAp.LJIIIIZZ(C13LQ.LJIJI(new ResolutionComponent[]{c912070ZqH.LJIILJJIL().LJ(zp(), "preview"), c912070ZqH.LJIILJJIL().LJ(zp(), "full"), content.thumbnailComponent.resolution, content.imageComponent.resolution}));
        C901890ZZr c901890ZZrAp2 = Ap();
        C869590Y9l c869590Y9lZp = zp();
        C2242281CpW c2242281CpWLIZ = C911320Zp4.LIZ(content.fallbackInfo);
        C869590Y9l c869590Y9lZp2 = zp();
        String strLIZJ = c912070ZqH.LJIILJJIL().LIZJ(c869590Y9lZp2);
        C724270Sb3 c724270Sb3 = this.LLJI;
        ImageComponent imageComponent2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        PictureCardTemplate content2 = ((InterfaceC911100Zoi) obj).getContent();
        if (content2 != null) {
            imageComponent = content2.thumbnailComponent;
        } else {
            imageComponent = null;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        PictureCardTemplate content3 = ((InterfaceC911100Zoi) obj2).getContent();
        if (content3 != null) {
            imageComponent2 = content3.imageComponent;
        }
        c901890ZZrAp2.LJ(c869590Y9lZp, content, c2242281CpWLIZ, C896400ZEo.LIZ(strLIZJ, imageComponent, imageComponent2, C13LP.LJLIL(c912070ZqH.LJIILJJIL().LJIIJJI(c869590Y9lZp2, "full"), c912070ZqH.LJIILJJIL().LJIIJJI(c869590Y9lZp2, "preview"))), false, yp().LL.isMediaMsgMasking(), yp().LL, C902260ZaS.LIZ(content), new AwS380S0200000_14((DMCameraPhotoCardAssem) this, interfaceC911100Zoi, (InterfaceC911100Zoi) 40));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Bp, reason: merged with bridge method [inline-methods] */
    public void sr(T t, List<? extends Object> list) {
        C911140Zom c911140Zom;
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
                if ((obj2 instanceof C911140Zom) && (c911140Zom = (C911140Zom) obj2) != null) {
                    if (c911140Zom.LIZ || c911140Zom.LIZJ) {
                        sp(t);
                    }
                    if (c911140Zom.LIZIZ) {
                        op(t.LIZJ());
                    }
                }
            }
            return;
        }
        sp(t);
        op(t.LIZJ());
    }

    public final void Ep(View view, boolean z) {
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14((DMCameraPhotoCardAssem) this, 966);
        ACListenerS149S0100000_14 aCListenerS149S0100000_14 = new ACListenerS149S0100000_14(awS558S0100000_14, 38);
        if ((z || !Ap().LJI(aCListenerS149S0100000_14, view)) && zp().isSuccessStatus()) {
            awS558S0100000_14.invoke();
        }
    }
}
