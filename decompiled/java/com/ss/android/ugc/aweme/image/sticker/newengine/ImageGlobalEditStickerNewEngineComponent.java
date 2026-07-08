package com.ss.android.ugc.aweme.image.sticker.newengine;

import X.AbstractC2255721DQs;
import X.C01GW;
import X.C05YF;
import X.C0CHQ;
import X.C0FEA;
import X.C0FFO;
import X.C0FSX;
import X.C0FSZ;
import X.C0FT5;
import X.C0FT7;
import X.C0FTB;
import X.C0FTJ;
import X.C0FUH;
import X.C0FVY;
import X.C12YW;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1403910mdZ;
import X.C1428150nGf;
import X.C1441980ncy;
import X.C1447800nmM;
import X.C1464900oDw;
import X.C1466090oFr;
import X.C1466170oFz;
import X.C1466810oH1;
import X.C15438062q;
import X.C1664590tQ1;
import X.C1697810uHb;
import X.C19292410dm;
import X.C19627211qg;
import X.C19647711tz;
import X.C19774612Ym;
import X.C19775212Ys;
import X.C1DRG;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2298208zU;
import X.C390390FSj;
import X.C452501pT;
import X.C560530Lyd;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import X.EnumC20228214Cy;
import X.EnumC356070Dxd;
import X.EnumC391400FWg;
import X.InterfaceC1451050nrb;
import X.InterfaceC1453410nvP;
import X.InterfaceC1459040o4U;
import X.InterfaceC1461390o8H;
import X.InterfaceC1464960oE2;
import X.InterfaceC1465010oE7;
import X.InterfaceC1731706qJ;
import X.InterfaceC19627811qm;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC386720FEg;
import X.InterfaceC388760FMc;
import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ImageGlobalEditStickerNewEngineComponent extends AbstractC2255721DQs<InterfaceC1464960oE2> implements InterfaceC1464960oE2, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C1DRG LL;
    public final FrameLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final VideoPublishEditModel LLILZ;
    public final ImageAlbumData LLILZIL;
    public final Scene LLILZLL;
    public C390390FSj LLJI;
    public C0FT7 LLJILLL;
    public final C1466170oFz LLJJIJIIJIL;
    public final C560530Lyd<Unit> LLIZ = new C560530Lyd<>();
    public final SparseArray<C19627211qg> LLIZLLLIL = new SparseArray<>();
    public final List<InterfaceC19627811qm> LLJ = new ArrayList();
    public InterfaceC1451050nrb LLJIJIL = (InterfaceC1451050nrb) getDiContainer().LJIIL(null, InterfaceC1451050nrb.class);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 125));
    public final InterfaceC1731706qJ LLJILJILJ = new C1466810oH1(this, 5);
    public final InterfaceC1453410nvP LLJJ = (InterfaceC1453410nvP) getDiContainer().LJII(InterfaceC1453410nvP.class, null);
    public final InterfaceC1465010oE7 LLJJI = (InterfaceC1465010oE7) getDiContainer().LJIIL(null, InterfaceC1465010oE7.class);
    public final InterfaceC1459040o4U LLJJIII = (InterfaceC1459040o4U) getDiContainer().LJIIL(null, InterfaceC1459040o4U.class);
    public final Map<EnumC1466150oFx, Function1<StickerModel, Unit>> LLJJIJI = new LinkedHashMap();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ImageGlobalEditStickerNewEngineComponent.class, "editItemStickerApi", "getEditItemStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/ItemEditStickerNewEngineApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJ = 8;
    }

    public InterfaceC1464960oE2 W1() {
        return this;
    }

    private final C0FT7 H2() {
        Function1<StickerModel, Unit> function1Pi;
        C0FFO c0ffo = new C0FFO(EnumC1466150oFx.PICTURE_HASHTAG_GLOBAL, 35, true, true, true, true, true, C1697810uHb.LJ(2), null, false, false, false, false, false, false, new C19774612Ym(1), 1834624);
        C0FFO c0ffo2 = new C0FFO(EnumC1466150oFx.MUSIC_STICKER, 0, false, false, false, false, false, null, null, false, false, false, false, false, false, new C19774612Ym(2), 1830886);
        C0FFO c0ffo3 = new C0FFO(EnumC1466150oFx.DM_GROUP_CHAT, 0, false, false, false, false, false, C1697810uHb.LJ(9, 10), new Pair(Float.valueOf(0.6f), Float.valueOf(1.2f)), false, false, false, false, false, false, new InterfaceC386720FEg() { // from class: X.11pM
            @Override // X.InterfaceC386720FEg
            public final AbstractC388880FMo LIZ(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
                IGroupChatStickerApi iGroupChatStickerApi = (IGroupChatStickerApi) PluggableExtentionKt.pluggableSpi$default(IGroupChatStickerApi.class, false, false, false, 14, null);
                if (iGroupChatStickerApi != null) {
                    return iGroupChatStickerApi.LJII(context, frameLayout, frameLayout2, lifecycleOwner, c390420FSm, new AwS573S0100000_29(this.LIZ, 126));
                }
                return null;
            }
        }, 1816318);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0ffo);
        arrayList.add(c0ffo2);
        arrayList.add(C1403910mdZ.LIZIZ());
        arrayList.add(c0ffo3);
        C390390FSj c390390FSj = new C390390FSj(C1664590tQ1.LJII(this), this.LLILLJJLI, this.LLILLL, new C0FUH(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), this.LLILZ.getCreativeInfo(), EnumC20228214Cy.IMAGE_STICKER, null, false, 12), null, 0, null, null, false, false, false, false, arrayList, EnumC391400FWg.IMAGE_GLOBAL_EDIT, false, !C1441980ncy.LIZIZ(this.LLILZ), C1441980ncy.LIZIZ(this.LLILZ), C1441980ncy.LIZIZ(this.LLILZ) ? C1428150nGf.LIZLLL() : 0, false, 403451), Z1(), this);
        this.LLJI = c390390FSj;
        c390390FSj.LJJZZI(o2());
        int size = this.LLIZLLLIL.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C19627211qg c19627211qg = this.LLIZLLLIL.get(this.LLIZLLLIL.keyAt(i));
            if (c19627211qg.LIZIZ == null) {
                C390390FSj c390390FSj2 = this.LLJI;
                GestureInteractItem gestureInteractItem = new GestureInteractItem(410, (c390390FSj2 != null ? c390390FSj2 : null).LJIIIIZZ);
                c19627211qg.LIZIZ = gestureInteractItem;
                c19627211qg.LIZ.LIZIZ(gestureInteractItem);
            }
            i++;
        }
        C390390FSj c390390FSj3 = this.LLJI;
        if (c390390FSj3 == null) {
            c390390FSj3 = null;
        }
        c390390FSj3.initService();
        this.LLJJIJI.put(EnumC1466150oFx.ADD_YOURS, new AwS608S0100000_29(this, 107));
        InterfaceC1459040o4U interfaceC1459040o4U = this.LLJJIII;
        if (interfaceC1459040o4U != null && (function1Pi = interfaceC1459040o4U.Pi()) != null) {
            this.LLJJIJI.put(EnumC1466150oFx.MUSIC_STICKER, function1Pi);
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LLILZLL);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLIILIL(this.LLILZLL, new C19775212Ys(this, 0));
        }
        C390390FSj c390390FSj4 = this.LLJI;
        if (c390390FSj4 != null) {
            return c390390FSj4;
        }
        return null;
    }

    private final C0FVY X1() {
        return (C0FVY) this.LLJILJILJ.getValue(this, LLJJIJIL[0]);
    }

    private final InterfaceC388760FMc Z1() {
        return (InterfaceC388760FMc) this.LLJILJIL.getValue();
    }

    private final C0FTB o2() {
        return new C0FTB() { // from class: X.11qW
            @Override // X.C0FTB
            public final void LIZIZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJFF(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJI(StickerModel stickerModel, boolean z) {
            }

            @Override // X.C0FTB
            public final void LJII() {
            }

            @Override // X.C0FTB
            public final void LJIIIIZZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIIIZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIIL(StickerModel stickerModel, int i) {
            }

            @Override // X.C0FTB
            public final void LJIILIIL(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIILJJIL(int i) {
            }

            @Override // X.C0FTB
            public final void LJIILL(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIJJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIJJLI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIL() {
            }

            @Override // X.C0FTB
            public final void LJJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIFFI(int i) {
            }

            @Override // X.C0FTB
            public final void LJJII(StickerModel stickerModel, MotionEvent motionEvent) {
            }

            @Override // X.C0FTB
            public final void LJJIII(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIIJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIIJZLJL(StickerModel stickerModel, boolean z, boolean z2) {
            }

            @Override // X.C0FTB
            public final void LJJIIZ() {
            }

            @Override // X.C0FTB
            public final void LJJIIZI(int i) {
            }

            @Override // X.C0FTB
            public final void LJJIJ() {
            }

            @Override // X.C0FTB
            public final void LJJIJIIJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final EnumC1466150oFx[] LJJIJIL() {
                return EnumC1466150oFx.values();
            }

            @Override // X.C0FTB
            public final void LIZJ(StickerModel stickerModel) {
                InterfaceC1451050nrb interfaceC1451050nrb = this.LL.LLJIJIL;
                if (interfaceC1451050nrb != null) {
                    C1456140nzo.LIZIZ(interfaceC1451050nrb, false, true, false, false, 12);
                }
            }

            @Override // X.C0FTB
            public final void LIZLLL(StickerModel stickerModel) {
                InterfaceC1451050nrb interfaceC1451050nrb = this.LL.LLJIJIL;
                if (interfaceC1451050nrb != null) {
                    C1456140nzo.LIZIZ(interfaceC1451050nrb, true, true, false, false, 12);
                }
                this.LL.h12(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LL.LLILZ;
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(videoPublishEditModel, null, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void LJ(StickerModel stickerModel) {
                this.LL.h12(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LL.LLILZ;
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(videoPublishEditModel, null, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void LJIIJJI(StickerModel stickerModel) {
                Function1<StickerModel, Unit> function1 = this.LL.LLJJIJI.get(stickerModel.getStickerType());
                if (function1 != null) {
                    function1.invoke(stickerModel);
                }
            }

            @Override // X.C0FTB
            public final void LJIILLIIL(int i) {
                C0FT7 c0ft7 = this.LL.LLJILLL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                C1403880mdW.LIZIZ(C1403880mdW.LIZ, this.LL.LLILZ, c0ft7.LLJJIJI(i), "click");
            }

            @Override // X.C0FTB
            public final void LJIIZILJ(StickerModel stickerModel) {
                this.LL.h12(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LL.LLILZ;
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(videoPublishEditModel, null, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void LJIJ(int i) {
                this.LL.ON2();
            }

            @Override // X.C0FTB
            public final void LJJIJIIJIL(int i) {
                C0FT7 c0ft7 = this.LL.LLJILLL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                C1403880mdW.LIZIZ(C1403880mdW.LIZ, this.LL.LLILZ, c0ft7.LLJJIJI(i), "change");
            }

            @Override // X.C0FTB
            public final void f4(StickerModel stickerModel) {
                this.LL.h12(stickerModel);
                this.LL.uR0().LJIIJ(Unit.LIZ);
            }

            @Override // X.C0FTB
            public final void LIZ(StickerModel stickerModel, boolean z) {
                this.LL.h12(stickerModel);
            }

            @Override // X.C0FTB
            public final void LJIIJ(StickerModel stickerModel, String str) {
                String str2;
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LL.LLILZ;
                c1403880mdW.getClass();
                C1403880mdW.LJ(videoPublishEditModel, null, stickerModel, null);
                if (Intrinsics.LJFF(str, "SLIDE_UP")) {
                    str2 = "drag";
                } else {
                    str2 = "other";
                }
                this.LL.LLJJIJIIJIL.LIZJ(stickerModel, str2, 0);
                ImageStickerInfoNewEngine stickerInfoNewEngine = this.LL.LLILZIL.getStickerInfoNewEngine();
                if (stickerInfoNewEngine != null) {
                    stickerInfoNewEngine.clearStickerById(stickerModel);
                }
                C1466090oFr.LIZJ(this.LL.LLILZ.creativeModel.stickerModel, stickerModel);
                this.LL.uR0().LJIIJ(Unit.LIZ);
            }
        };
    }

    @Override // X.InterfaceC1464960oE2
    public View Ck() {
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.Ja().LJI().LIZ();
    }

    @Override // X.InterfaceC1464960oE2
    public List<StickerModel> Dt() {
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.LIZLLL();
    }

    @Override // X.InterfaceC1464960oE2
    public void ON2() {
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        Iterator<StickerModel> it2 = c0ft7.LIZLLL().iterator();
        while (it2.hasNext()) {
            h12(it2.next());
        }
    }

    @Override // X.InterfaceC1464960oE2
    public void SO2() {
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LIZIZ(EnumC1466150oFx.PICTURE_HASHTAG_GLOBAL, null, null, "", AFwS273S0000000_29.get$arr$(71));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T2() {
        List<DMGroupChatStickerModel> list = this.LLILZ.creativeModel.stickerModel.dmGroupChatStickerModel;
        if (list.isEmpty()) {
            return;
        }
        if (this.LLILZIL.getStickerInfoNewEngine() == null) {
            this.LLILZIL.setStickerInfoNewEngine(new ImageStickerInfoNewEngine(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0));
        }
        ImageStickerInfoNewEngine stickerInfoNewEngine = this.LLILZIL.getStickerInfoNewEngine();
        if (stickerInfoNewEngine == null) {
            return;
        }
        List<DMGroupChatStickerModel> dmGroupChatStickerModels = stickerInfoNewEngine.getDmGroupChatStickerModels();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(dmGroupChatStickerModels, 10));
        Iterator<DMGroupChatStickerModel> it2 = dmGroupChatStickerModels.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().getId()));
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        for (DMGroupChatStickerModel dMGroupChatStickerModel : list) {
            if (!setLLIIJI.contains(Integer.valueOf(dMGroupChatStickerModel.getId()))) {
                stickerInfoNewEngine.getDmGroupChatStickerModels().add(dMGroupChatStickerModel);
            }
        }
    }

    public final InterfaceC388760FMc w2() {
        return new InterfaceC388760FMc() { // from class: X.11qd
            @Override // X.InterfaceC388760FMc
            public final C0FF8 LIZ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19628411qs LIZJ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19639511sf LIZLLL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FEQ LJFF() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FUB LJII() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19627911qn LJIIIIZZ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FKH LJIIJ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C390610FTf LJIIJJI() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19604511n1 LJIIL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19656311vN LJIILL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FLH LJIILLIIL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19605411nA LJIJ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJIJI(boolean z) {
            }

            @Override // X.InterfaceC388760FMc
            public final boolean LJIJJ() {
                return false;
            }

            @Override // X.InterfaceC388760FMc
            public final boolean LJIJJLI() {
                return true;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FL9 LJIL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJI() {
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIFFI() {
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJII() {
            }

            @Override // X.InterfaceC388760FMc
            public final int LJJIII() {
                return 0;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19614111oZ getHashTagService() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FUI w() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC386690FEd LIZIZ() {
                C1441900ncq c1441900ncq = new C1441900ncq();
                C823050WQl.LJ();
                C574220Mfc c574220Mfc = new C574220Mfc(c1441900ncq);
                if (c574220Mfc.LJII != null) {
                    return new C386390FCz(c574220Mfc.LJJ());
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C19647711tz LJIIIZ() {
                return this.LIZ.G2();
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC390170FRn LJIILIIL() {
                InterfaceC1465010oE7 interfaceC1465010oE7 = this.LIZ.LLJJI;
                if (interfaceC1465010oE7 != null) {
                    return interfaceC1465010oE7.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FKI LJJ() {
                C1664590tQ1.LJIIIZ(this.LIZ);
                return new C0FIG();
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIIJZLJL() {
                InterfaceC1465010oE7 interfaceC1465010oE7 = this.LIZ.LLJJI;
                if (interfaceC1465010oE7 != null) {
                    interfaceC1465010oE7.LJLLL("");
                }
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> getVideoList() {
                return new ArrayList();
            }

            @Override // X.InterfaceC388760FMc
            public final float LJ() {
                if (LIZIZ() != null) {
                    return ((AbstractC386380FCy) r0).LLL();
                }
                return 0.0f;
            }

            @Override // X.InterfaceC388760FMc
            public final float LJI() {
                if (LIZIZ() != null) {
                    return ((AbstractC386380FCy) r0).getDuration();
                }
                return 0.0f;
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> LJIIZILJ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJIILJJIL(int i) {
                InterfaceC1451050nrb interfaceC1451050nrb;
                if (i == 2 && (interfaceC1451050nrb = this.LIZ.LLJIJIL) != null) {
                    C1456140nzo.LIZIZ(interfaceC1451050nrb, true, true, false, false, 12);
                }
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIIJ(int i) {
                InterfaceC1451050nrb interfaceC1451050nrb;
                if (i == 2 && (interfaceC1451050nrb = this.LIZ.LLJIJIL) != null) {
                    C1456140nzo.LIZIZ(interfaceC1451050nrb, false, true, false, false, 12);
                }
            }
        };
    }

    public final C19647711tz G2() {
        String strLIZJ;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        UrlModel avatarThumb = currentUser != null ? currentUser.getAvatarThumb() : null;
        if (C0FEA.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            C1464900oDw c1464900oDw = C1464900oDw.LIZ;
            C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            Resources resources = C1664590tQ1.LJIIIZ(this).getResources();
            c1464900oDw.getClass();
            sbLIZ.append(C1464900oDw.LIZJ(currentUser2, resources));
            strLIZJ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            C1464900oDw c1464900oDw2 = C1464900oDw.LIZ;
            C19292410dm currentUser3 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            Resources resources2 = C1664590tQ1.LJIIIZ(this).getResources();
            c1464900oDw2.getClass();
            strLIZJ = C1464900oDw.LIZJ(currentUser3, resources2);
        }
        float f = C0FEA.LIZIZ() ? 17.0f : 15.0f;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("");
        C1464900oDw c1464900oDw3 = C1464900oDw.LIZ;
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        C19292410dm currentUser4 = C0CHQ.LIZ().getAccountService().getCurrentUser();
        c1464900oDw3.getClass();
        sbLIZ2.append(C1464900oDw.LIZ(contextLJIIIZ, currentUser4));
        return new C19647711tz(avatarThumb, strLIZJ != null ? strLIZJ : "", f, C2188811AlT.LIZIZ(sbLIZ2), 63);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        ViewTreeObserver viewTreeObserver;
        super.onCreate();
        this.LLJILLL = H2();
        View view = this.LLILZLL.mView;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        C12YW c12yw = new C12YW(this, 2);
        viewTreeObserver.addOnGlobalLayoutListener(c12yw);
        C2187701Ajg.LIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1464960oE2
    public C560530Lyd<Unit> uR0() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1464960oE2
    public View xw() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1464960oE2
    public void Dm1(int i) {
        GestureInteractItem gestureInteractItem;
        C19627211qg c19627211qg = this.LLIZLLLIL.get(i);
        if (c19627211qg != null && (gestureInteractItem = c19627211qg.LIZIZ) != null) {
            c19627211qg.LIZ.LIZ(gestureInteractItem);
        }
        this.LLIZLLLIL.remove(i);
    }

    @Override // X.InterfaceC1464960oE2
    public void J4(StickerModel stickerModel) {
        if (this.LLJI != null) {
            C0FT7 c0ft7 = this.LLJILLL;
            if (c0ft7 == null) {
                c0ft7 = null;
            }
            c0ft7.k3(stickerModel, EnumC356070Dxd.COMMIT);
        }
    }

    @Override // X.InterfaceC1464960oE2
    public void LJJZZI(C0FTB c0ftb) {
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 != null) {
            c0ft7.LJJZZI(c0ftb);
        }
    }

    @Override // X.InterfaceC1464960oE2
    public void LJLLLL(C0FTB c0ftb) {
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 != null) {
            c0ft7.LJLLLL(c0ftb);
        }
    }

    @Override // X.InterfaceC1464960oE2
    public <T> T LLIIIZ(EnumC1466150oFx enumC1466150oFx) {
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 == null) {
            return null;
        }
        return (T) c0ft7.LLIIIZ(enumC1466150oFx);
    }

    @Override // X.InterfaceC1464960oE2
    public List<C0FTJ<StickerModel>> LLLLLZ(EnumC1466150oFx enumC1466150oFx) {
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 != null) {
            return c0ft7.LLLLLZ(enumC1466150oFx);
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1464960oE2
    public void LLLLZLL(boolean z) {
        int i;
        FrameLayout frameLayout = this.LLILLJJLI;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LJZ(i, frameLayout);
    }

    @Override // X.InterfaceC1464960oE2
    public StickerModel f4(StickerModel stickerModel) {
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.f3(stickerModel, EnumC356070Dxd.COMMIT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h12(StickerModel stickerModel) {
        if (this.LLILZIL.getStickerInfoNewEngine() == null) {
            this.LLILZIL.setStickerInfoNewEngine(new ImageStickerInfoNewEngine(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0));
        }
        if (stickerModel.isNotEmptyModel()) {
            ImageStickerInfoNewEngine stickerInfoNewEngine = this.LLILZIL.getStickerInfoNewEngine();
            if (stickerInfoNewEngine != null) {
                stickerInfoNewEngine.addStickerByType(stickerModel);
            }
            C1466090oFr.LIZIZ(this.LLILZ.creativeModel.stickerModel, stickerModel);
            return;
        }
        ImageStickerInfoNewEngine stickerInfoNewEngine2 = this.LLILZIL.getStickerInfoNewEngine();
        if (stickerInfoNewEngine2 != null) {
            stickerInfoNewEngine2.clearStickerById(stickerModel);
        }
        C1466090oFr.LIZJ(this.LLILZ.creativeModel.stickerModel, stickerModel);
    }

    @Override // X.InterfaceC1464960oE2
    public void ur(Function1<? super C0FT5, C0FT5> function1) {
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 != null) {
            c0ft7.ur(function1);
            for (InterfaceC19627811qm interfaceC19627811qm : this.LLJ) {
                C0FT7 c0ft72 = this.LLJILLL;
                if (c0ft72 == null) {
                    c0ft72 = null;
                }
                c0ft72.LJFF(new AwS608S0100000_29(interfaceC19627811qm, 108));
            }
        }
    }

    @Override // X.InterfaceC1464960oE2
    public void wQ0(StickerModel stickerModel) {
        h12(stickerModel);
    }

    @Override // X.InterfaceC1464960oE2
    public void B71(int i, InterfaceC1461390o8H interfaceC1461390o8H) {
        C390390FSj c390390FSj = this.LLJI;
        if (c390390FSj == null) {
            this.LLIZLLLIL.put(i, new C19627211qg(interfaceC1461390o8H, null));
            return;
        }
        GestureInteractItem gestureInteractItem = new GestureInteractItem(410, c390390FSj.LJIIIIZZ);
        interfaceC1461390o8H.LIZIZ(gestureInteractItem);
        this.LLIZLLLIL.put(i, new C19627211qg(interfaceC1461390o8H, gestureInteractItem));
    }

    @Override // X.InterfaceC1464960oE2
    public void FD0(InterfaceC19627811qm interfaceC19627811qm, Function1<? super C0FT5, Unit> function1) {
        this.LLJ.add(interfaceC19627811qm);
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 != null) {
            c0ft7.LJFF(function1);
        } else {
            function1.invoke(new C0FT5(true));
        }
    }

    @Override // X.InterfaceC1464960oE2
    public void Rd1(int i, String str) {
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LJIIJ(i, str, true, EnumC356070Dxd.COMMIT);
    }

    @Override // X.InterfaceC1464960oE2
    public void Zw0(Lifecycle lifecycle, InterfaceC19627811qm interfaceC19627811qm, Function1<? super C0FT5, Unit> function1) {
        this.LLJ.add(interfaceC19627811qm);
        C0FT7 c0ft7 = this.LLJILLL;
        if (c0ft7 != null) {
            c0ft7.LJFF(function1);
        } else {
            function1.invoke(new C0FT5(true));
        }
        lifecycle.addObserver(new ImageGlobalEditStickerNewEngineComponent$addStickerGlobalConfigObserver$1(this, interfaceC19627811qm));
    }

    @Override // X.InterfaceC1464960oE2
    public void Dr(EnumC1466150oFx enumC1466150oFx, StickerModel stickerModel, String str, Function1<? super StickerModel, Unit> function1) {
        int id;
        if (this.LLJI != null) {
            C0FT7 c0ft7 = this.LLJILLL;
            if (c0ft7 == null) {
                c0ft7 = null;
            }
            if (stickerModel != null) {
                id = stickerModel.getId();
            } else {
                id = -1;
            }
            c0ft7.LIZIZ(enumC1466150oFx, c0ft7.tq(id), null, str, function1);
        }
    }

    public ImageGlobalEditStickerNewEngineComponent(C1DRG c1drg, FrameLayout frameLayout, FrameLayout frameLayout2, VideoPublishEditModel videoPublishEditModel, ImageAlbumData imageAlbumData, Scene scene) {
        this.LL = c1drg;
        this.LLILLJJLI = frameLayout;
        this.LLILLL = frameLayout2;
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = imageAlbumData;
        this.LLILZLL = scene;
        this.LLJJIJIIJIL = new C1466170oFz(videoPublishEditModel);
    }

    @Override // X.InterfaceC1464960oE2
    public void LLILII(boolean z, String str, int i, C0FSX c0fsx, Integer num, Integer num2, Integer num3, Integer num4, C0FSZ c0fsz) {
        if (this.LLJI != null) {
            C0FT7 c0ft7 = this.LLJILLL;
            if (c0ft7 == null) {
                c0ft7 = null;
            }
            c0ft7.Ja().LLILII(z, str, i, c0fsx, num, num2, num3, num4, c0fsz);
        }
    }
}
