package com.ss.android.ugc.aweme.im.sdk.chat.ui.gif;

import X.AnonymousClass0206;
import X.C019F;
import X.C01GW;
import X.C0I9I;
import X.C0ICF;
import X.C0ICG;
import X.C0ICH;
import X.C0ICN;
import X.C0IDR;
import X.C0ZDX;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1383370m6R;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19MX;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C457780HxI;
import X.C461530I7z;
import X.C462630ICf;
import X.C687700QyG;
import X.C723590SZx;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C898900ZOe;
import X.C902500Zaq;
import X.C912220ZqW;
import X.InterfaceC1146704e9;
import X.InterfaceC1320380kSq;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.Size;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.GifCardReusedUISlot;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionGiphyMessage;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class GifCardReusedUISlot extends ReusedUISlotAssem<GifCardReusedUISlot> implements InterfaceC712990Rxx<C0ICG>, InterfaceC1146704e9 {
    public static final C0ICF LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public static final int LLL;
    public static final int LLLF;
    public static final C01GW<Integer> LLLFF;
    public static final C01GW<Integer> LLLFFI;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(90));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 317));
    public final C902500Zaq LLJLL = new C902500Zaq();
    public final C0ICN LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GifCardReusedUISlot.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLLL = new C0ICF();
        LLJZIJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112));
        LLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
        LLLF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
        LLLFF = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(192));
        LLLFFI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(193));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0ICN] */
    public GifCardReusedUISlot() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 318), AFwS236S0000000_6.get$arr$(182), null, true);
        this.LLJLLIL = new C0I9I() { // from class: X.0ICN
            @Override // X.C0I9I
            public final void LIZJ(String str) {
            }

            @Override // X.C0I9I
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.C0I9I
            public final void LIZIZ(String str, Throwable th) {
                String message;
                GifCardReusedUISlot gifCardReusedUISlot = this.LIZ;
                if (th == null || (message = th.getMessage()) == null) {
                    message = "";
                }
                gifCardReusedUISlot.LLJLL.LIZ("sticker_store", new C0ZYR(message));
            }

            @Override // X.C0I9I
            public final void LIZ(String str, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
                GifCardReusedUISlot gifCardReusedUISlot = this.LIZ;
                gifCardReusedUISlot.LLJLL.LIZ("sticker_store", C0ICO.LIZ);
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.clc;
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
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final RemoteImageView sp() {
        return (RemoteImageView) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        ((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LL.findViewById(R.id.nzx).getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        C19MX c19mx = (C19MX) ((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LL.findViewById(R.id.ev_);
        if (c19mx != null) {
            c19mx.setReferencedIds(new int[]{R.id.apb, R.id.eu1});
        }
        Context context = sp().getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) != null) {
            sp().setBackgroundColor(numLIZJ.intValue());
        }
        LJJIJL().addOnAttachStateChangeListener(new C0IDR(this, 2));
        LJJIJL().setContentDescription("GIF");
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 37), LJJIJL());
    }

    public final void op(GifContent gifContent) {
        boolean z = true;
        if (gifContent == null || (gifContent.type != 502 && gifContent.type != 503 && gifContent.type != 505)) {
            z = false;
        }
        Object obj = null;
        if (z) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            C462630ICf c462630ICf = ((C0ICG) obj).LIZJ().LIZ;
            C1331100kk8 c1331100kk8LIZIZ = C912220ZqW.LIZIZ(LJJIJL().getContext(), c462630ICf.LIZ, c462630ICf.LIZIZ, c462630ICf.LIZJ, c462630ICf.LIZLLL);
            C1331070kk5 hierarchy = sp().getHierarchy();
            if (hierarchy != null) {
                hierarchy.LJJIII(c1331100kk8LIZIZ);
                return;
            }
            return;
        }
        C1331070kk5 hierarchy2 = sp().getHierarchy();
        if (hierarchy2 == null) {
            return;
        }
        hierarchy2.LJJIII(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0ICG r26) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.GifCardReusedUISlot.up(X.0ICG):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ICG c0icg) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ICG c0icg) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ICH c0ich;
        C0ICG c0icg = (C0ICG) interfaceC1587906Jp;
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
                if ((obj2 instanceof C0ICH) && (c0ich = (C0ICH) obj2) != null && c0ich.LIZ) {
                    op(c0icg.getContent());
                }
            }
            return;
        }
        up(c0icg);
    }

    public static boolean up(GifCardReusedUISlot gifCardReusedUISlot, C869590Y9l c869590Y9l, RemoteImageView remoteImageView) {
        String strLJI;
        LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI;
        LightInteractionGiphyMessage giphyMessage;
        InterfaceC1320380kSq interfaceC1320380kSq;
        ILightInteractionPlatformService iLightInteractionPlatformService = (ILightInteractionPlatformService) gifCardReusedUISlot.LLJLIL.getValue();
        gifCardReusedUISlot.getClass();
        boolean zLJJIJLIJ = false;
        int i = 0;
        zLJJIJLIJ = false;
        zLJJIJLIJ = false;
        zLJJIJLIJ = false;
        zLJJIJLIJ = false;
        if (c869590Y9l != null && iLightInteractionPlatformService != null && (strLJI = iLightInteractionPlatformService.LJI(c869590Y9l)) != null && (lightInteractionCommonResourceLJJIIZI = iLightInteractionPlatformService.LJJIIZI(strLJI)) != null && (giphyMessage = lightInteractionCommonResourceLJJIIZI.getGiphyMessage()) != null) {
            Integer num = giphyMessage.width;
            Integer num2 = giphyMessage.height;
            String str = giphyMessage.imageType;
            if (str != null && Intrinsics.LJFF(str.toLowerCase(Locale.getDefault()), "gif")) {
                interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
            } else {
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
            }
            remoteImageView.getHierarchy().LJIIZILJ(interfaceC1320380kSq);
            LLJLLL.getClass();
            Size sizeLIZ = C0ICF.LIZ(num, num2, str);
            int width = sizeLIZ.getWidth();
            if (width < 0) {
                width = 0;
            }
            int height = sizeLIZ.getHeight();
            if (height >= 0) {
                i = height;
            }
            C1383370m6R.LJIILJJIL(width, i, remoteImageView);
            zLJJIJLIJ = iLightInteractionPlatformService.LJJJIL().LJJIJLIJ(!C0ZDX.LJJJJIZL(c869590Y9l), c869590Y9l, sizeLIZ, remoteImageView, gifCardReusedUISlot.LLJLLIL);
            if (!zLJJIJLIJ) {
                remoteImageView.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LIZJ);
            }
        }
        return zLJJIJLIJ;
    }
}
