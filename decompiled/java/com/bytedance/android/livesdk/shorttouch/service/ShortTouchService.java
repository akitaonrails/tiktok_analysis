package com.bytedance.android.livesdk.shorttouch.service;

import X.AbstractC1086990eOP;
import X.AbstractC1101760emE;
import X.C001A;
import X.C09JN;
import X.C0GY9;
import X.C0IJT;
import X.C0J1N;
import X.C0UO0;
import X.C1100140ejc;
import X.C1101600ely;
import X.C1101610elz;
import X.C1101640em2;
import X.C1101660em4;
import X.C1101730emB;
import X.C1101750emD;
import X.C1101810emJ;
import X.C1101820emK;
import X.C1101900emS;
import X.C1101970emZ;
import X.C1102000emc;
import X.C11RD;
import X.C11S5;
import X.C1954807lC;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C776250Uch;
import X.C930940aKi;
import X.EnumC1101860emO;
import X.InterfaceC1085330eLj;
import X.InterfaceC1101720emA;
import X.InterfaceC420801kM;
import Y.ALAdapterS3S0100000_6;
import Y.AfS153S0200000_17;
import Y.AfS6S0100100_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.shorttouch.network.ShortTouchApi;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchApiMergeReportSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchApiRequestOptSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchBigCardOptSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchNewFrameworkSetting;
import com.bytedance.android.livesdk.model.ShortTouchTemplateData;
import com.bytedance.android.livesdk.model.message.ShortTouchMessage;
import com.bytedance.android.livesdk.shorttouch.ui.LandscapeShortTouchPreviewWidget;
import com.bytedance.android.livesdk.shorttouch.ui.LandscapeShortTouchViewWidget;
import com.bytedance.android.livesdk.shorttouch.ui.PortraitShortTouchPreviewWidget;
import com.bytedance.android.livesdk.shorttouch.ui.PortraitShortTouchViewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes18.dex */
public class ShortTouchService implements IShortTouchService {
    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void MJ2() {
        ((LinkedHashMap) C1101900emS.LIZ).clear();
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void S91() {
        IMessageManager iMessageManager;
        Boolean bool;
        C1101610elz c1101610elz = C1102000emc.LIZ;
        List<C1101970emZ> list = c1101610elz.LIZJ;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() >= 1) {
                HashMap map = new HashMap(11);
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    String idStr = room.getIdStr();
                    if (idStr == null) {
                        idStr = String.valueOf(room.getId());
                    }
                    map.put("room_id", idStr);
                    map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                }
                DataChannel dataChannel = c1101610elz.LJI;
                map.put("is_anchor", (dataChannel == null || (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) == null || !bool.booleanValue()) ? CardStruct.IStatusCode.DEFAULT : "1");
                HashMap map2 = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C1101640em2 c1101640em2LIZJ = c1101610elz.LIZJ(EnumC1101860emO.ID, ((C1101970emZ) it2.next()).LIZIZ);
                    if (c1101640em2LIZJ != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c1101640em2LIZJ.LJ);
                        sbLIZ.append("_node_count");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        Long l = (Long) map2.get(strLIZIZ);
                        map2.put(strLIZIZ, Long.valueOf((l != null ? l.longValue() : 0L) + 1));
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_short_touch_queue_release");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJJIJ(map2);
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }
        }
        List<C1101640em2> list2 = c1101610elz.LIZIZ;
        if (list2 != null) {
            for (C1101640em2 c1101640em2 : (ArrayList) list2) {
                c1101640em2.LIZ.LJLJL();
                InterfaceC1101720emA interfaceC1101720emA = c1101640em2.LIZIZ;
                if (interfaceC1101720emA != null) {
                    interfaceC1101720emA.LJLJL();
                }
            }
        }
        C1101600ely c1101600ely = c1101610elz.LJIIJ;
        c1101600ely.getClass();
        LiveShortTouchApiRequestOptSetting.INSTANCE.enable();
        LiveShortTouchNewFrameworkSetting liveShortTouchNewFrameworkSetting = LiveShortTouchNewFrameworkSetting.INSTANCE;
        if (liveShortTouchNewFrameworkSetting.enableNewFramework()) {
            InterfaceC420801kM interfaceC420801kM = c1101600ely.LLJILLL;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            c1101600ely.LLJILLL = null;
            if (liveShortTouchNewFrameworkSetting.enableNewFramework()) {
                c1101600ely.LLIZLLLIL = null;
                c1101600ely.LLIZ = null;
                C1101810emJ c1101810emJ = c1101600ely.LLILZIL;
                if (c1101810emJ != null) {
                    ((LinkedHashMap) c1101810emJ.LIZIZ).clear();
                }
                C1101730emB c1101730emB = c1101600ely.LLILZLL;
                if (c1101730emB != null) {
                    Iterator<AbstractC1101760emE> it3 = c1101730emB.LIZIZ.iterator();
                    while (it3.hasNext()) {
                        it3.next().LJIILIIL();
                    }
                    c1101730emB.LIZIZ.clear();
                    c1101730emB.LIZJ = false;
                }
                Iterator<T> it4 = c1101600ely.LLJI.iterator();
                while (it4.hasNext()) {
                    ((AbstractC1101760emE) it4.next()).LJIILIIL();
                }
                ((LinkedList) c1101600ely.LLJI).clear();
                c1101600ely.LLJILJIL = false;
                c1101600ely.LLJILJILJ.removeCallbacksAndMessages(null);
                c1101600ely.LLILZIL = null;
                c1101600ely.LLILZLL = null;
                List<ShortTouchMessage> list3 = c1101600ely.LLJJIJI;
                if (list3 != null) {
                    ((ArrayList) list3).clear();
                }
                c1101600ely.LLJJIJI = null;
                C20441214yg.LIZIZ(c1101600ely.LL, "ShortTouchManager reset completed");
            }
            c1101600ely.LLJIJIL = null;
            DataChannel dataChannel2 = c1101600ely.LLILLL;
            if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener(C001A.SHORT_TOUCH_MESSAGE.getIntType(), c1101600ely);
            }
            c1101600ely.LLILLJJLI = null;
            c1101600ely.LLILLL = null;
            c1101600ely.LLILZ = null;
            ((LinkedHashMap) c1101600ely.LLJ).clear();
            c1101600ely.LLJJI = false;
        }
        c1101610elz.LJI = null;
        c1101610elz.LJII.removeCallbacksAndMessages(null);
        c1101610elz.LIZIZ = null;
        c1101610elz.LIZJ = null;
        c1101610elz.LIZ = false;
        c1101610elz.LJIIIIZZ = true;
        c1101610elz.LJIIIZ = null;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final int X70() {
        List<C1101640em2> list = C1102000emc.LIZ.LIZIZ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final Class<? extends LiveRecyclableWidget> NF2() {
        return PortraitShortTouchPreviewWidget.class;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final Class<? extends LiveRecyclableWidget> O30() {
        return LandscapeShortTouchPreviewWidget.class;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final Class<? extends LiveRecyclableWidget> f30() {
        return PortraitShortTouchViewWidget.class;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final Class<? extends LiveRecyclableWidget> no0() {
        return LandscapeShortTouchViewWidget.class;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void SJ(AbstractC1086990eOP abstractC1086990eOP) {
        C1101600ely c1101600ely = C1102000emc.LIZ.LJIIJ;
        c1101600ely.getClass();
        if (LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            c1101600ely.LLJ.put("shortTouchCustomPoll", abstractC1086990eOP);
        }
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService, X.InterfaceC1087010eOR
    public final C1101820emK Td(String str) {
        return C1101750emD.LIZIZ(str);
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void bC0(ShortTouchTemplateData shortTouchTemplateData) throws JSONException {
        if (LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            C1102000emc.LIZ.LJIIJ.LJII("shortTouchCustomPoll", shortTouchTemplateData, null);
        }
    }

    @Override // X.InterfaceC1087010eOR
    public final void Ud(EnumC1101860emO enumC1101860emO, String str) {
        C1102000emc.LIZ.LJFF(enumC1101860emO, str);
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void VW(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        if (dataChannel != null && LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            C1101600ely c1101600ely = C1102000emc.LIZ.LJIIJ;
            c1101600ely.getClass();
            C480460Ism.LIZ().getClass();
            c1101600ely.LLJILLL = ((C0J1N) ((ShortTouchApi) C480460Ism.LIZLLL(ShortTouchApi.class)).getShortTouchV2(Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)), Long.valueOf(C500260Jjc.LIZIZ(dataChannel))).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new AfS153S0200000_17(lifecycleOwner, c1101600ely, 25), new C09JN() { // from class: X.00p0
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ShortTouchManager@c96e.requestShortTouch$2");
                    C20441214yg.LJII((Throwable) obj);
                    C1C7U.LIZIZ("ShortTouchManager@c96e.requestShortTouch$2");
                }
            });
        }
    }

    @Override // X.InterfaceC1087010eOR
    public final void Yd(InterfaceC1085330eLj interfaceC1085330eLj, InterfaceC1101720emA interfaceC1101720emA) {
        Xd(interfaceC1085330eLj, interfaceC1101720emA, C2097608Jq.LJ());
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final InterfaceC1085330eLj ja0(EnumC1101860emO enumC1101860emO, String str) {
        AbstractC1101760emE next;
        boolean zLJFF;
        C1101610elz c1101610elz = C1102000emc.LIZ;
        c1101610elz.getClass();
        if (LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            C1101730emB c1101730emB = c1101610elz.LJIIJ.LLILZLL;
            if (c1101730emB == null) {
                return null;
            }
            Iterator<AbstractC1101760emE> it2 = c1101730emB.LIZIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AbstractC1101760emE abstractC1101760emE = next;
                    int i = C1101660em4.LIZ[enumC1101860emO.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            zLJFF = Intrinsics.LJFF(abstractC1101760emE.LJIILL(), str);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        zLJFF = Intrinsics.LJFF(abstractC1101760emE.LIZJ(), str);
                    }
                    if (zLJFF) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC1101760emE abstractC1101760emE2 = next;
            if (abstractC1101760emE2 == null) {
                return null;
            }
            return abstractC1101760emE2.LLILZIL;
        }
        C1101640em2 c1101640em2LIZJ = c1101610elz.LIZJ(enumC1101860emO, str);
        if (c1101640em2LIZJ == null) {
            return null;
        }
        return c1101640em2LIZJ.LIZ;
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final Animator rb0(View view, boolean z) {
        return xM1(view, 660L, z);
    }

    @Override // X.InterfaceC1087010eOR
    public final void Xd(InterfaceC1085330eLj interfaceC1085330eLj, InterfaceC1101720emA interfaceC1101720emA, Map<String, String> map) {
        C1101610elz c1101610elz = C1102000emc.LIZ;
        c1101610elz.getClass();
        c1101610elz.LIZ(C1101610elz.LIZIZ(interfaceC1085330eLj, interfaceC1101720emA, map));
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void Y92(DataChannel dataChannel, Long l, LifecycleOwner lifecycleOwner) {
        long jLJJLIIIJ;
        String secUid;
        User owner;
        if (dataChannel == null) {
            return;
        }
        if (l != null) {
            jLJJLIIIJ = l.longValue();
        } else {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (LiveShortTouchApiMergeReportSetting.INSTANCE.enable()) {
            C1101750emD.LIZLLL(dataChannel, true, null, null, null, null, null);
        }
        C480460Ism.LIZ().getClass();
        ShortTouchApi shortTouchApi = (ShortTouchApi) C480460Ism.LIZLLL(ShortTouchApi.class);
        Long lValueOf = Long.valueOf(jLJJLIIIJ);
        String string = null;
        if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
            secUid = owner.getSecUid();
        } else {
            secUid = null;
            if (roomLJJLIIIIJ != null) {
            }
            ((C0J1N) shortTouchApi.getShortTouch(3L, lValueOf, secUid, string, 1, 1, 1, 1).LJIILIIL(new C0UO0()).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new AfS6S0100100_17(jCurrentTimeMillis, dataChannel, 6), new AfS6S0100100_17(jCurrentTimeMillis, dataChannel, 7));
        }
        User owner2 = roomLJJLIIIIJ.getOwner();
        if (owner2 != null) {
            string = Long.valueOf(owner2.getId()).toString();
        }
        ((C0J1N) shortTouchApi.getShortTouch(3L, lValueOf, secUid, string, 1, 1, 1, 1).LJIILIIL(new C0UO0()).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new AfS6S0100100_17(jCurrentTimeMillis, dataChannel, 6), new AfS6S0100100_17(jCurrentTimeMillis, dataChannel, 7));
    }

    @Override // X.InterfaceC1087010eOR
    public final InterfaceC1101720emA Zd(Context context, Uri uri, boolean z) {
        return new C1100140ejc(context, uri, this, z);
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final void mD1(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        C1101610elz c1101610elz = C1102000emc.LIZ;
        c1101610elz.getClass();
        c1101610elz.LIZIZ = new ArrayList();
        c1101610elz.LIZJ = new ArrayList();
        c1101610elz.LJIIIZ = null;
        c1101610elz.LIZ = false;
        c1101610elz.LJI = dataChannel;
        C1101600ely c1101600ely = c1101610elz.LJIIJ;
        c1101600ely.getClass();
        if (LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            c1101600ely.LLILLL = dataChannel;
            c1101600ely.LLILLJJLI = context;
            c1101600ely.LLILZ = lifecycleOwner;
            c1101600ely.LLJIJIL = new ArrayList();
            c1101600ely.LLJJIJI = new ArrayList();
            DataChannel dataChannel2 = c1101600ely.LLILLL;
            if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
                iMessageManager.addMessageListener(C001A.SHORT_TOUCH_MESSAGE.getIntType(), (OnIMMessageListener) c1101600ely);
            }
        }
    }

    @Override // com.bytedance.android.live.shorttouch.service.IShortTouchService
    public final Animator xM1(View view, long j, boolean z) {
        boolean z2;
        float fLIZIZ;
        if (z && LiveShortTouchBigCardOptSetting.INSTANCE.enable()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[2];
        if (C497740JfY.LJJ()) {
            if (z2) {
                fLIZIZ = C497740JfY.LIZIZ(84.0f);
            } else {
                fLIZIZ = C497740JfY.LIZIZ(82.0f);
            }
        } else if (z2) {
            fLIZIZ = C497740JfY.LIZIZ(-84.0f);
        } else {
            fLIZIZ = C497740JfY.LIZIZ(-82.0f);
        }
        fArr[0] = (int) fLIZIZ;
        fArr[1] = 0.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        objectAnimatorOfFloat.setDuration(480L);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.41f, 1.44f, 0.42f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(460L);
        objectAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(1.0f, -0.62f, 0.63f, 0.9f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.0f);
        objectAnimatorOfFloat4.setDuration(460L);
        objectAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(1.0f, -0.62f, 0.63f, 0.9f));
        AnimatorSet animatorSet = new AnimatorSet();
        if (z2) {
            animatorSet.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
            animatorSet.play(objectAnimatorOfFloat2);
        } else {
            animatorSet.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
            animatorSet.play(objectAnimatorOfFloat2).before(objectAnimatorOfFloat3);
            animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
        }
        animatorSet.addListener(new ALAdapterS3S0100000_6(view, 59));
        return animatorSet;
    }

    @Override // X.InterfaceC1087010eOR
    public final void Wd(EnumC1101860emO enumC1101860emO, String str, InterfaceC1085330eLj interfaceC1085330eLj, InterfaceC1101720emA interfaceC1101720emA) {
        C1101610elz c1101610elz = C1102000emc.LIZ;
        Map mapLJ = C2097608Jq.LJ();
        c1101610elz.getClass();
        C1101640em2 c1101640em2LIZIZ = C1101610elz.LIZIZ(interfaceC1085330eLj, interfaceC1101720emA, mapLJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Short touch presenter] Refresh item, identify = ");
        sbLIZ.append(enumC1101860emO);
        sbLIZ.append(", value = ");
        sbLIZ.append(str);
        sbLIZ.append(", id = ");
        sbLIZ.append(c1101640em2LIZIZ.LIZLLL);
        sbLIZ.append(", name = ");
        sbLIZ.append(c1101640em2LIZIZ.LJ);
        C20441214yg.LIZIZ("TikTok Live Short Touch", C2188811AlT.LIZIZ(sbLIZ));
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(c1101640em2LIZIZ.LIZ.Sr());
        if (c1101820emKLIZIZ != null) {
            c1101820emKLIZIZ.LJIIZILJ = true;
        }
        c1101610elz.LJFF(enumC1101860emO, str);
        c1101610elz.LIZ(c1101640em2LIZIZ);
    }

    @Override // X.InterfaceC1087010eOR
    public final InterfaceC1085330eLj Vd(Context context, Uri uri, Lifecycle lifecycle, String str, String str2, boolean z) {
        return new ShortTouchService$simpleCreateView$1(context, uri, lifecycle, str, str2, z);
    }

    @Override // X.InterfaceC1087010eOR
    public final void be(Context context, EnumC1101860emO enumC1101860emO, String str, Uri uri, String str2, Uri uri2, Boolean bool, Lifecycle lifecycle) {
        C1100140ejc c1100140ejc;
        InterfaceC1085330eLj interfaceC1085330eLjVd = Vd(context, uri, lifecycle, str2, null, false);
        if (interfaceC1085330eLjVd != null) {
            if (uri2 != null && bool != null) {
                c1100140ejc = new C1100140ejc(context, uri2, this, bool.booleanValue());
            } else {
                c1100140ejc = null;
            }
            Wd(enumC1101860emO, str, interfaceC1085330eLjVd, c1100140ejc);
        }
    }
}
