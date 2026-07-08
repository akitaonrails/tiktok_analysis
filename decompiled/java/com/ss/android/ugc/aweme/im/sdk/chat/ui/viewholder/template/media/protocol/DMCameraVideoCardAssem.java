package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C01GW;
import X.C03H5;
import X.C0I6Y;
import X.C0QSJ;
import X.C0ZQS;
import X.C123100dR;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C1397760mTe;
import X.C13LE;
import X.C13LQ;
import X.C1509305vX;
import X.C1559260qg8;
import X.C20094413jq;
import X.C20094813ju;
import X.C2217381BqS;
import X.C2242281CpW;
import X.C2242711CqD;
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
import X.C898900ZOe;
import X.C901890ZZr;
import X.C902260ZaS;
import X.C902500Zaq;
import X.C911140Zom;
import X.C912070ZqH;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.InterfaceC910980ZoW;
import X.InterfaceC911210Zot;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import Y.ACListenerS149S0100000_14;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public abstract class DMCameraVideoCardAssem<T extends InterfaceC910980ZoW, RECEIVER extends C03H5> extends ReusedUISlotAssem<RECEIVER> implements InterfaceC712990Rxx<T>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJJLIIIJLLLLLLLZ = C1509305vX.LIZ(new AwS558S0100000_14((DMCameraVideoCardAssem) this, 971));
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJLIL;
    public final C902500Zaq LLJLILLLLZIIL;
    public volatile InterfaceC911210Zot LLJLL;
    public InterfaceC665370Q7z LLJLLIL;
    public C0QSJ LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DMCameraVideoCardAssem.class, "messageListFMPTracker", "getMessageListFMPTracker()Lcom/ss/android/ugc/aweme/im/messagelist/perf/IMMessageListFMPTracker;", 0);
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

    public final InterfaceC911210Zot tp() throws IllegalAccessException {
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

    public final C869590Y9l up() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null));
    }

    public final C901890ZZr yp() {
        return (C901890ZZr) this.LLJLIL.getValue();
    }

    public DMCameraVideoCardAssem() {
        checkSupervisorPrepared();
        new C723590SZx(this, C898900ZOe.class, null);
        this.LLJLIL = C1509305vX.LIZ(new AwS558S0100000_14((DMCameraVideoCardAssem) this, 972));
        this.LLJLILLLLZIIL = new C902500Zaq();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        View viewFindViewById = getContentView().findViewById(R.id.xuu);
        if (viewFindViewById != null) {
            int i = C20094413jq.LJIIZILJ;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LIZ = C1383370m6R.LJIIJ(R.string.video);
            c1397760mTe.LJFF = C1383370m6R.LJIIJ(2131823179);
            C20094813ju.LIZ(viewFindViewById, c1397760mTe.LIZ());
            C786410Ut5.I7(new ACListenerS149S0100000_14(this, 67), viewFindViewById);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC913860ZtA(this, 9));
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
        yp().getClass();
        ((RoundingCornerLayout) this.LLJJLIIIJLLLLLLLZ.getValue()).setRoundingParams(c462630ICf);
        getContentView().setBackground(C462590ICb.LIZIZ(c462620ICe, getContentView()));
        Drawable background = getContentView().getBackground();
        if (yp().LLJILJIL) {
            i = 0;
        } else {
            i = 255;
        }
        background.setAlpha(i);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        InterfaceC910980ZoW interfaceC910980ZoW = (InterfaceC910980ZoW) obj;
        sp(interfaceC910980ZoW);
        op(interfaceC910980ZoW.LIZJ());
    }

    public final void sp(InterfaceC910980ZoW interfaceC910980ZoW) {
        ResolutionComponent resolutionComponent;
        VideoCardTemplate content = interfaceC910980ZoW.getContent();
        if (content == null) {
            return;
        }
        this.LLJLILLLLZIIL.LIZJ(up(), "private_video");
        C901890ZZr c901890ZZrYp = yp();
        ResolutionComponent[] resolutionComponentArr = new ResolutionComponent[3];
        C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
        boolean z = false;
        resolutionComponentArr[0] = c912070ZqH.LJIILJJIL().LJ(interfaceC910980ZoW.LLILII().LIZ.LIZ, "cover");
        VideoCoverComponent videoCoverComponent = content.baseVideoComponent;
        resolutionComponentArr[1] = videoCoverComponent.resolutionComponent;
        ImageComponent imageComponent = videoCoverComponent.coverImage;
        if (imageComponent != null) {
            resolutionComponent = imageComponent.resolution;
        } else {
            resolutionComponent = null;
        }
        resolutionComponentArr[2] = resolutionComponent;
        c901890ZZrYp.LJIIIIZZ(C13LQ.LJIJI(resolutionComponentArr));
        C901890ZZr c901890ZZrYp2 = yp();
        C869590Y9l c869590Y9l = interfaceC910980ZoW.LLILII().LIZ.LIZ;
        C2242281CpW c2242281CpWLIZIZ = C2242711CqD.LIZIZ(C0ZQS.LIZIZ(interfaceC910980ZoW.LLILII().LIZ.LIZ, content));
        C869590Y9l c869590Y9l2 = interfaceC910980ZoW.LLILII().LIZ.LIZ;
        String strLJIIJ = c912070ZqH.LJIILJJIL().LJIIJ(c869590Y9l2);
        if (strLJIIJ == null || strLJIIJ.length() <= 0) {
            if (!c912070ZqH.LJIILJJIL().LIZIZ(c869590Y9l2)) {
                strLJIIJ = c912070ZqH.LJIILJJIL().LJIIIIZZ(c869590Y9l2);
            } else {
                strLJIIJ = null;
            }
        }
        List<String> listLIZ = C896400ZEo.LIZ(strLJIIJ, content.baseVideoComponent.coverImage, null, c912070ZqH.LJIILJJIL().LJIIJJI(interfaceC910980ZoW.LLILII().LIZ.LIZ, "cover"));
        if (C123100dR.LIZ(content.baseVideoComponent.videoModel) || C123100dR.LIZ(c912070ZqH.LJIILJJIL().LJIIIIZZ(up()))) {
            z = true;
        }
        c901890ZZrYp2.LJ(c869590Y9l, content, c2242281CpWLIZIZ, listLIZ, z, ((C457780HxI) this.LLJL.getValue()).LL.isMediaMsgMasking(), ((C457780HxI) this.LLJL.getValue()).LL, C902260ZaS.LIZ(content), new AwS380S0200000_14((DMCameraVideoCardAssem) this, interfaceC910980ZoW, (InterfaceC910980ZoW) 43));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    public final void Ap(View view, boolean z) {
        AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14((DMCameraVideoCardAssem) this, view, (View) 47);
        ACListenerS149S0100000_14 aCListenerS149S0100000_14 = new ACListenerS149S0100000_14(awS415S0200000_14, 39);
        if ((z || !yp().LJI(aCListenerS149S0100000_14, view)) && up().isSuccessStatus()) {
            awS415S0200000_14.invoke();
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
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
}
