package com.bytedance.android.livesdk.toolbar;

import X.C0J0I;
import X.C0J3Y;
import X.C0J40;
import X.C0J4A;
import X.C0JGL;
import X.C0JGM;
import X.C0JGN;
import X.C0TA9;
import X.C1094690eap;
import X.C1094720eas;
import X.C1094730eat;
import X.C1099650eip;
import X.C1099740eiy;
import X.C1099770ej1;
import X.C1099960ejK;
import X.C1102420enI;
import X.C1102670enh;
import X.C1102680eni;
import X.C1102690enj;
import X.C1161920gLG;
import X.C1954807lC;
import X.C485730J3b;
import X.C485760J3e;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1088870eRR;
import X.EnumC1088900eRU;
import X.EnumC1099940ejI;
import X.EnumC485780J3g;
import X.InterfaceC1088880eRS;
import X.InterfaceC1097800efq;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.CommentForceIconStyle;
import com.bytedance.android.live.notify.ILiveNotifyService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveToolbarExpandAndCommentSetting;
import com.bytedance.android.livesdk.toolbarv2.view.AnchorToolbarWidget;
import com.bytedance.android.livesdk.toolbarv2.view.AudienceLandscapeToolbarWidget;
import com.bytedance.android.livesdk.toolbarv2.view.AudienceLeftToolbarWidget;
import com.bytedance.android.livesdk.toolbarv2.view.AudienceRightToolbarWidget;
import com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
public class ToolbarService implements IToolbarService {
    public final Map<DataChannel, InterfaceC1097800efq> LL = new LinkedHashMap();
    public final Map<DataChannel, C0J0I> LLILLJJLI = new LinkedHashMap();

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void EX1() {
        C1099770ej1.LL.getClass();
        C1099770ej1.LLILLJJLI = null;
        C1099770ej1.LLILLL = null;
        C1099770ej1.LLILZ = null;
        C1099770ej1.LLILZIL = null;
        C1099770ej1.LLILZLL.removeCallbacksAndMessages(null);
        IBusinessAvoidanceService iBusinessAvoidanceService = (IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class);
        C1099740eiy c1099740eiy = C1099770ej1.LLIZ;
        C1099960ejK c1099960ejK = C1099770ej1.LLILLJJLI;
        iBusinessAvoidanceService.im2(c1099740eiy, c1099960ejK != null ? c1099960ejK.LIZJ : null);
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void Yg() {
        C0JGN c0jgn = C0JGL.LIZ;
        ((LinkedHashMap) C0JGL.LIZIZ).clear();
        ((LinkedHashMap) C0JGL.LIZJ).clear();
        C0JGL.LIZLLL = null;
        C0JGL.LJ = null;
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void aj2() {
        C0J3Y c0j3y = C0J3Y.LIZ;
        C485730J3b c485730J3bLIZ = C485760J3e.LIZ("ttlive_widget_anchor_toolbar");
        EnumC485780J3g enumC485780J3g = EnumC485780J3g.UN_SET;
        c0j3y.getClass();
        C0J3Y.LJIILIIL(R.layout.hxg, null, c485730J3bLIZ, enumC485780J3g, false);
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void tc1() {
        C0J3Y c0j3y = C0J3Y.LIZ;
        C485730J3b c485730J3bLIZ = C485760J3e.LIZ("ttlive_widget_audience_left_toolbar");
        EnumC485780J3g enumC485780J3g = EnumC485780J3g.UN_SET;
        c0j3y.getClass();
        C0J3Y.LJIILIIL(R.layout.hxi, null, c485730J3bLIZ, enumC485780J3g, false);
        C485730J3b c485730J3bLIZ2 = C485760J3e.LIZ("ttlive_widget_audience_right_toolbar");
        EnumC485780J3g enumC485780J3g2 = EnumC485780J3g.UN_SET;
        c0j3y.getClass();
        C0J3Y.LJIILIIL(R.layout.hxj, null, c485730J3bLIZ2, enumC485780J3g2, false);
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final Class VP1() {
        return LiveAudienceToolbarWidget.class;
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final InterfaceC1088880eRS Mn1(DataChannel dataChannel) {
        if (dataChannel != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) C0TA9.LIZ;
            Object c1102680eni = linkedHashMap.get(dataChannel);
            if (c1102680eni == null) {
                c1102680eni = new C1102680eni(new C1102690enj());
                linkedHashMap.put(dataChannel, c1102680eni);
            }
            return (InterfaceC1088880eRS) c1102680eni;
        }
        return C1102670enh.LIZ;
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void Ok(DataChannel dataChannel) {
        List list;
        if (dataChannel != null) {
            C0TA9.LIZ.remove(dataChannel);
        }
        C0J0I c0j0iRemove = this.LLILLJJLI.remove(dataChannel);
        if (c0j0iRemove != null) {
            ((ILiveNotifyService) C1161920gLG.LIZJ(ILiveNotifyService.class)).VR(dataChannel, c0j0iRemove);
        }
        InterfaceC1097800efq interfaceC1097800efqRemove = this.LL.remove(dataChannel);
        if (interfaceC1097800efqRemove != null) {
            HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
            C1099650eip c1099650eip = (C1099650eip) ((LinkedHashMap) C1102420enI.LJIJJ).get(Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)));
            if (c1099650eip != null && (list = (List) ((LinkedHashMap) c1099650eip.LIZ).get(16)) != null) {
                list.remove(interfaceC1097800efqRemove);
            }
        }
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final C1102690enj hy0(DataChannel dataChannel) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) C0TA9.LIZ;
        Object c1102680eni = linkedHashMap.get(dataChannel);
        if (c1102680eni == null) {
            c1102680eni = new C1102680eni(new C1102690enj());
            linkedHashMap.put(dataChannel, c1102680eni);
        }
        return ((C1102680eni) c1102680eni).LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    @Override // com.bytedance.android.live.toolbar.IToolbarService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void VT(com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment r11, final com.bytedance.ies.sdk.datachannel.DataChannel r12) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.toolbar.ToolbarService.VT(com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final Class bP2(EnumC1088870eRR enumC1088870eRR, DataChannel dataChannel) {
        C1094730eat c1094730eatLIZ = C1094720eas.LIZ(dataChannel);
        int i = C1094690eap.LIZJ[c1094730eatLIZ.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AnchorToolbarWidget.class;
            }
            throw new C1954807lC();
        }
        int i2 = C1094690eap.LIZIZ[c1094730eatLIZ.LIZIZ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return AudienceLandscapeToolbarWidget.class;
            }
            throw new C1954807lC();
        }
        if (enumC1088870eRR != null) {
            int i3 = C1094690eap.LIZ[enumC1088870eRR.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return AudienceRightToolbarWidget.class;
                }
                return null;
            }
            return AudienceLeftToolbarWidget.class;
        }
        return null;
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void ba0(int i, Context context) {
        int layoutId;
        MutableContextWrapper mutableContextWrapper;
        if (LiveToolbarReuseOptimizeSetting.INSTANCE.enable()) {
            if (ToolBarButtonWithTextExperiment.hasText()) {
                layoutId = EnumC1099940ejI.ICON_WITH_TEXT.getLayoutId();
            } else {
                layoutId = EnumC1099940ejI.ICON.getLayoutId();
            }
        } else if (ToolBarButtonWithTextExperiment.hasText()) {
            layoutId = EnumC1088900eRU.ICON_WITH_TEXT.getLayoutId();
        } else {
            layoutId = EnumC1088900eRU.ICON.getLayoutId();
        }
        C0JGN c0jgn = C0JGL.LIZ;
        if (LiveLayoutPreloadSetting.INSTANCE.enable() && context != null) {
            C0JGL.LIZLLL = C786410Ut5.ne(new MutableContextWrapper(context));
            C0JGL.LJ = new C0J4A(new MutableContextWrapper(context));
            Stack stack = (Stack) ((LinkedHashMap) C0JGL.LIZIZ).get(Integer.valueOf(layoutId));
            if (stack != null) {
                Iterator it2 = stack.iterator();
                while (it2.hasNext()) {
                    Context context2 = ((View) it2.next()).getContext();
                    if ((context2 instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context2) != null) {
                        mutableContextWrapper.setBaseContext(context);
                    }
                }
            }
            Map<Integer, Stack<View>> map = C0JGL.LIZIZ;
            Integer numValueOf = Integer.valueOf(layoutId);
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object stack2 = linkedHashMap.get(numValueOf);
            if (stack2 == null) {
                stack2 = new Stack();
                linkedHashMap.put(numValueOf, stack2);
            }
            int size = i - ((Vector) stack2).size();
            for (int i2 = 0; i2 < size; i2++) {
                C0J4A c0j4a = C0JGL.LJ;
                if (c0j4a != null) {
                    C0JGM c0jgm = new C0JGM(layoutId);
                    C0J40 c0j40LIZIZ = c0j4a.LIZJ.LLILLL.LIZIZ();
                    if (c0j40LIZIZ == null) {
                        c0j40LIZIZ = new C0J40();
                    }
                    c0j40LIZIZ.LIZ = c0j4a;
                    c0j40LIZIZ.LIZJ = layoutId;
                    c0j40LIZIZ.LIZLLL = 0;
                    c0j40LIZIZ.LIZIZ = null;
                    c0j40LIZIZ.LJI = c0jgm;
                    c0j40LIZIZ.LJFF = null;
                    c0j40LIZIZ.LJIIJJI = false;
                    c0j40LIZIZ.LJIIJ = false;
                    c0j4a.LIZJ.LIZJ(c0j40LIZIZ);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void GL(boolean z, boolean z2, DataChannel dataChannel) {
        if (dataChannel == null || !LiveToolbarExpandAndCommentSetting.INSTANCE.enableCommentForceIcon()) {
            return;
        }
        Pair pair = (Pair) dataChannel.gg0(CommentForceIconStyle.class);
        if (pair != null && ((Boolean) pair.getFirst()).booleanValue() == z && ((Boolean) pair.getSecond()).booleanValue() == z2) {
            return;
        }
        dataChannel.zW(CommentForceIconStyle.class, new Pair(Boolean.valueOf(z), Boolean.valueOf(z2)));
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void xG(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        C1099770ej1.LL.getClass();
        C1099770ej1.LLILLJJLI = new C1099960ejK(context, lifecycleOwner, dataChannel);
        ((IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class)).az(C1099770ej1.LLIZ, dataChannel);
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void xV(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        Map<DataChannel, C1102680eni> map = C0TA9.LIZ;
        C1102680eni c1102680eni = (C1102680eni) ((LinkedHashMap) map).get(dataChannel);
        if (c1102680eni == null) {
            C1102690enj c1102690enj = new C1102690enj();
            c1102690enj.LJIIIIZZ(new C1099960ejK(context, lifecycleOwner, dataChannel));
            map.put(dataChannel, new C1102680eni(c1102690enj));
            return;
        }
        c1102680eni.LIZ.LJIIIIZZ(new C1099960ejK(context, lifecycleOwner, dataChannel));
    }
}
