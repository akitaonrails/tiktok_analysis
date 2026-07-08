package com.bytedance.android.livesdk.like;

import X.C0IK5;
import X.C0IKU;
import X.C0IX1;
import X.C0IXW;
import X.C0IXY;
import X.C0J1N;
import X.C0J1R;
import X.C0KXJ;
import X.C0RT0;
import X.C0UVH;
import X.C1086420eNU;
import X.C1087930ePv;
import X.C1087970ePz;
import X.C1088010eQ3;
import X.C1088040eQ6;
import X.C1088070eQ9;
import X.C1148270fzF;
import X.C1161920gLG;
import X.C11NZ;
import X.C11RD;
import X.C1494690ozz;
import X.C14KS;
import X.C1602160rnK;
import X.C1811850xFX;
import X.C19EG;
import X.C1CC2;
import X.C2188811AlT;
import X.C376710Epp;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C463640IGc;
import X.C476120Ilm;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501520Jle;
import X.C776250Uch;
import X.C781120UkY;
import X.C786410Ut5;
import X.C814420VxA;
import X.C963140bAe;
import X.EnumC1101430elh;
import X.InterfaceC1085480eLy;
import X.InterfaceC1086400eNS;
import X.InterfaceC1086480eNa;
import X.InterfaceC1087920ePu;
import X.InterfaceC420801kM;
import X.InterfaceC475810IlH;
import Y.ARunnableS117S0100000_17;
import Y.ATListenerS450S0100000_17;
import Y.AfS1S0102100_17;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.chatroom.model.LikeResponse;
import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.android.livesdk.dataChannel.GlobalLikeContinueTarget;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.SelfLikeTextMessageDisplayed;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeApi;
import com.bytedance.android.livesdk.like.widget.OthersLikeWidget;
import com.bytedance.android.livesdk.like.widget.SelfLikeWidget;
import com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeRequestOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeTapCountMonitorSampleRateSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class LikeHelper implements InterfaceC1085480eLy, GenericLifecycleObserver {
    public static final /* synthetic */ int LLLJL = 0;
    public LifecycleOwner LL;
    public final C19EG LLILLJJLI;
    public Room LLILLL;
    public boolean LLILZ;
    public final ATListenerS450S0100000_17 LLILZIL;
    public final List<InterfaceC1087920ePu> LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final long LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final long LLJILJIL;
    public final boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public final String LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public boolean LLJJJIL;
    public final boolean LLJJJJ;
    public final boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final SparseArray<Bitmap> LLJJLIIIJLLLLLLLZ = new SparseArray<>();
    public final List<Bitmap> LLJL = new ArrayList();
    public final BitmapFactory.Options LLJLIL;
    public final DataChannel LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public final Map<String, InterfaceC420801kM> LLJLLL;
    public int[] LLJZ;
    public final SparseArray<Bitmap> LLJZIJLIL;
    public final Random LLL;
    public final List<Bitmap> LLLF;
    public final List<Bitmap> LLLFF;
    public final Map<String, Bitmap> LLLFFI;
    public final List<Bitmap> LLLFZ;
    public final List<Bitmap> LLLI;
    public SelfLikeWidget LLLII;
    public OthersLikeWidget LLLIIII;
    public List<InterfaceC1086400eNS> LLLIIIIL;
    public int LLLIIIL;
    public int LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public long LLLILZJ;
    public String LLLILZLLLI;
    public final List<C0RT0> LLLIZZ;
    public final C1086420eNU LLLJ;
    public final BPEAHandler LLLJIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    static {
        C497740JfY.LIZ(32.0f);
    }

    @Override // X.InterfaceC1085480eLy
    public final void LIZJ() {
        Bitmap bitmap = this.LLJJLIIIJLLLLLLLZ.get(R.drawable.dl1);
        if (bitmap != null) {
            this.LLJJLIIIJLLLLLLLZ.remove(R.drawable.dl1);
            ((ArrayList) this.LLJL).remove(bitmap);
        }
    }

    @Override // X.InterfaceC1085480eLy
    public final boolean LJ() {
        return !LiveLikeDegradeSettings.INSTANCE.disableLottieAnim(this.LLJLILLLLZIIL);
    }

    @Override // X.InterfaceC1085480eLy
    public final void LJIIIIZZ() {
        Bitmap bitmapDecodeResource;
        if (this.LLJJLIIIJLLLLLLLZ.get(R.drawable.dl1) == null && (bitmapDecodeResource = BitmapFactory.decodeResource(this.LLILLJJLI.getResources(), R.drawable.dl1, this.LLJLIL)) != null) {
            this.LLJJLIIIJLLLLLLLZ.put(R.drawable.dl1, bitmapDecodeResource);
            ((ArrayList) this.LLJL).add(bitmapDecodeResource);
        }
    }

    @Override // X.InterfaceC1085480eLy
    public final void LJIILL() {
        SelfLikeWidget selfLikeWidget = this.LLLII;
        if (selfLikeWidget != null) {
            selfLikeWidget.x1(LJJIII(R.drawable.fas));
        }
    }

    @Override // X.InterfaceC1085480eLy
    public final void LJIIZILJ() {
        Bitmap bitmapLJJIII;
        OthersLikeWidget othersLikeWidget = this.LLLIIII;
        if (othersLikeWidget == null || (bitmapLJJIII = LJJIII(R.drawable.fat)) == null || bitmapLJJIII.isRecycled() || !othersLikeWidget.isViewValid()) {
            return;
        }
        othersLikeWidget.z1(R.drawable.fat, bitmapLJJIII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1085480eLy
    public final boolean LJIJJ() {
        C0IKU c0ikuP71;
        if (!LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getEnableLikeProgressAnim() || (c0ikuP71 = ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).P71("inner_room_downgrade_scene", EnumC1101430elh.LIKE_PROGRESS_ANIM, null, Integer.class)) == null) {
            return this.LLJJL;
        }
        return this.LLJJL && !(((Integer) c0ikuP71.LIZ).intValue() > 0);
    }

    @Override // X.InterfaceC1085480eLy
    public final void LJIJJLI() {
        OthersLikeWidget othersLikeWidget = this.LLLIIII;
        if (othersLikeWidget != null) {
            C19EG c19eg = this.LLILLJJLI;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            c419910GdJ.LIZ = R.raw.icon_color_repost;
            Bitmap bitmapLIZIZ = C376710Epp.LIZIZ(c419910GdJ.LIZ(c19eg));
            if (bitmapLIZIZ == null || bitmapLIZIZ.isRecycled() || !othersLikeWidget.isViewValid()) {
                return;
            }
            othersLikeWidget.z1(R.raw.icon_color_repost, bitmapLIZIZ);
        }
    }

    public final boolean LJJII() {
        boolean z = this.LLJLILLLLZIIL.gg0(UserIsAnchorChannel.class) == null || !((Boolean) this.LLJLILLLLZIIL.gg0(UserIsAnchorChannel.class)).booleanValue() || DiggParamsSetting.INSTANCE.getValue().likeStyle == 1;
        Room room = this.LLILLL;
        return (room == null || room.getRoomAuthStatus() == null || this.LLILLL.getRoomAuthStatus().isEnableDigg()) && z && UserService.getInstance().user().isLogin();
    }

    public final boolean LJJIIJ() {
        return LiveLikeDegradeSettings.INSTANCE.disableEasterEggs(this.LLJLILLLLZIIL);
    }

    public final boolean LJJIIJZLJL() {
        if (this.LLJLILLLLZIIL.gg0(LiveCenterStatusChannel.class) != C0UVH.DISMISS) {
            return false;
        }
        return ((C500260Jjc.LJIIZILJ(this.LLJLILLLLZIIL) && ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(this.LLJLILLLLZIIL)) || !this.LLJJJJLIIL || this.LLJJJIL) ? false : true;
    }

    public final boolean LJJIIZ() {
        return this.LLLILZJ == -1 || C963140bAe.LIZJ() > this.LLLILZJ;
    }

    public final Bitmap LJJIIZI() {
        Bitmap bitmapLJJIII;
        if (!((ArrayList) this.LLLF).isEmpty()) {
            List<Bitmap> list = this.LLLF;
            bitmapLJJIII = (Bitmap) ListProtector.get(list, this.LLL.nextInt(((ArrayList) list).size()));
        } else {
            if (!this.LLJILJILJ) {
                int[] iArr = this.LLJZ;
                if (iArr != null && iArr.length > 0) {
                    bitmapLJJIII = LJJIII(iArr[this.LLL.nextInt(iArr.length)]);
                }
                return null;
            }
            bitmapLJJIII = LJJIII(R.drawable.evd);
        }
        if (bitmapLJJIII == null || bitmapLJJIII.isRecycled()) {
            return null;
        }
        return bitmapLJJIII;
    }

    public final int LJJIJ() {
        int i = this.LLLIIIL;
        if (i > 0) {
            return i;
        }
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            this.LLLIIIL = C497740JfY.LJIIIZ(R.dimen.aki);
        } else {
            this.LLLIIIL = C497740JfY.LJIIIZ(R.dimen.akh);
        }
        return this.LLLIIIL;
    }

    public final void LJJIJLIJ() {
        IBarrageService iBarrageService = (IBarrageService) C1161920gLG.LIZJ(IBarrageService.class);
        C0IX1 c0ix1JF2 = iBarrageService.jF2(this.LLILLL.getId());
        if (c0ix1JF2.LIZ != 0) {
            return;
        }
        if (Boolean.TRUE.equals(this.LLJLILLLLZIIL.gg0(FirstFrameChannelEvent.class))) {
            c0ix1JF2.LIZ = 1;
        } else {
            c0ix1JF2.LIZ = -1;
        }
        Iterator it2 = ((ArrayList) this.LLILZLL).iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof InterfaceC1086480eNa) {
                c0ix1JF2.LIZIZ = true;
            }
        }
        iBarrageService.OW0(this.LLILLL.getId(), c0ix1JF2);
    }

    @Override // X.InterfaceC1085480eLy
    public final void clear() {
        ((ArrayList) this.LLLIZZ).clear();
        this.LL = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LiveMode streamType;
        int i;
        if (LiveLikeRequestOptSetting.INSTANCE.enableExitRoomRequest()) {
            if (this.LLLJIL.hasMessages(2)) {
                LJJIJIL(this.LLJI, 2);
            }
            if (this.LLLJIL.hasMessages(1) && (i = this.LLIZLLLIL % this.LLJI) != 0) {
                LJJIJIL(i, 2);
                LJJIJL(i, this.LLILLL.getOwnerUserId(), false);
            }
        }
        this.LLLJIL.removeMessages(1);
        this.LLLJIL.removeMessages(2);
        ((ArrayList) this.LLILZLL).clear();
        this.LLJJLIIIJLLLLLLLZ.clear();
        for (Bitmap bitmap : (ArrayList) this.LLJL) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
        }
        ((ArrayList) this.LLJL).clear();
        for (int i2 = 0; i2 < this.LLJZIJLIL.size(); i2++) {
            Bitmap bitmap2 = this.LLJZIJLIL.get(i2);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
            }
        }
        this.LLJZIJLIL.clear();
        this.LLJZ = null;
        for (InterfaceC420801kM interfaceC420801kM : ((HashMap) this.LLJLLL).values()) {
            if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
                interfaceC420801kM.dispose();
            }
        }
        List<InterfaceC1086400eNS> list = this.LLLIIIIL;
        if (list != null) {
            ((ArrayList) list).clear();
            this.LLLIIIIL = null;
        }
        LifecycleOwner lifecycleOwner = this.LL;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
        if (LiveLikeTapCountMonitorSampleRateSetting.hit()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("bottom_right_anim_total_amount", C1087930ePv.LIZ);
                jSONObject3.put("bottom_right_anim_display_amount", C1087930ePv.LIZIZ);
                jSONObject3.put("watch_live_duration", SystemClock.uptimeMillis() - C1087930ePv.LJIIIIZZ);
                jSONObject3.put("widget", C1087930ePv.LIZJ);
                int i3 = C1087930ePv.LIZLLL;
                if (i3 >= 0) {
                    jSONObject3.put("default_icon_show_count", i3);
                }
                jSONObject3.put("top_left_anim_like_count", C1087930ePv.LJ);
                jSONObject3.put("full_progress_anim_like_count", C1087930ePv.LJFF);
                jSONObject3.put("like_total_count", C1087930ePv.LJI);
                Room room = C1087930ePv.LJII;
                jSONObject3.put("anchor_id", room != null ? Long.valueOf(room.getOwnerUserId()) : null);
                Room room2 = C1087930ePv.LJII;
                jSONObject3.put("room_id", room2 != null ? Long.valueOf(room2.getId()) : null);
                Room room3 = C1087930ePv.LJII;
                jSONObject3.put("room_type", (room3 == null || (streamType = room3.getStreamType()) == null) ? null : streamType.logStreamingType);
                C1087930ePv.LIZJ(jSONObject, jSONObject2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1CC2.LJI("ttlive_like_tap_count", jSONObject, jSONObject2, jSONObject3);
        }
        HashMap<String, C1088010eQ3> map = C1087930ePv.LJIIIZ;
        if (!map.isEmpty()) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                for (Map.Entry<String, C1088010eQ3> entry : map.entrySet()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(entry.getKey());
                    sbLIZ.append("_max");
                    jSONObject4.put(C2188811AlT.LIZIZ(sbLIZ), entry.getValue().LIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(entry.getKey());
                    sbLIZ2.append("_average");
                    jSONObject4.put(C2188811AlT.LIZIZ(sbLIZ2), entry.getValue().LIZIZ / ((long) entry.getValue().LIZJ));
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C1CC2.LJI("ttlive_on_like_duration", new JSONObject(), null, jSONObject4);
        }
        C1087930ePv.LIZ = 0;
        C1087930ePv.LIZIZ = 0;
        C1087930ePv.LIZLLL = -1;
        C1087930ePv.LJ = 0;
        C1087930ePv.LJFF = 0;
        C1087930ePv.LJI = 0;
        C1087930ePv.LJII = null;
        C1087930ePv.LJIIIIZZ = 0L;
        C1087930ePv.LJIIIZ.clear();
    }

    @Override // X.InterfaceC1085480eLy
    public final boolean LJFF() {
        if (LJJIIJZLJL()) {
            for (View view : (ArrayList) this.LLLIZZ) {
                if (view != null) {
                    int visibility = view.getVisibility();
                    view.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, view);
                }
            }
            if (!this.LLJILLL) {
                this.LLIZ++;
                this.LLIZLLLIL = 0;
                if (LJJIIZ()) {
                    this.LLJILLL = true;
                    return true;
                }
                C786410Ut5.LJJZZIII(C0IK5.LIZ(), new ARunnableS117S0100000_17(this, 274));
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1085480eLy
    public final boolean LIZIZ() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1085480eLy
    public final long LJI() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1085480eLy
    public final boolean LJII() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1085480eLy
    public final int LJIIJJI() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1085480eLy
    public final int LJIILLIIL() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1085480eLy
    public final View.OnTouchListener LJJ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1085480eLy
    public final boolean LJJI() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1085480eLy
    public final View LJJIFFI() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC1085480eLy
    public final int getTotal() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1085480eLy
    public final boolean isEnabled() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1085480eLy
    public final boolean isPaused() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1085480eLy
    public final void LIZ(View view) {
        LIZLLL(view, false);
    }

    @Override // X.InterfaceC1085480eLy
    public final void LJIIJ(InterfaceC1087920ePu interfaceC1087920ePu) {
        if (interfaceC1087920ePu != null && !((ArrayList) this.LLILZLL).contains(interfaceC1087920ePu)) {
            ((ArrayList) this.LLILZLL).add(interfaceC1087920ePu);
        }
    }

    @Override // X.InterfaceC1085480eLy
    public final void LJIIL(C1088070eQ9 c1088070eQ9) {
        if (this.LLLIIIIL == null) {
            this.LLLIIIIL = new ArrayList();
        }
        if (c1088070eQ9 != null && !((ArrayList) this.LLLIIIIL).contains(c1088070eQ9)) {
            ((ArrayList) this.LLLIIIIL).add(c1088070eQ9);
        }
    }

    @Override // X.InterfaceC1085480eLy
    public final void LJIILIIL(List<C0RT0> list) {
        for (Object obj : (ArrayList) list) {
            if (obj != null) {
                ((ArrayList) this.LLLIZZ).add(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r0 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // X.InterfaceC1085480eLy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap LJIILJJIL(java.lang.Boolean r4) {
        /*
            r3 = this;
            java.util.List<android.graphics.Bitmap> r0 = r3.LLJL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            java.util.List<android.graphics.Bitmap> r2 = r3.LLJL
            java.util.Random r1 = r3.LLL
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r0 = r1.nextInt(r0)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L28
            boolean r1 = r0.isRecycled()
            if (r1 != 0) goto L28
        L27:
            return r0
        L28:
            java.util.List<android.graphics.Bitmap> r0 = r3.LLLFZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L49
            java.util.List<android.graphics.Bitmap> r2 = r3.LLLFZ
            java.util.Random r1 = r3.LLL
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r0 = r1.nextInt(r0)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 != 0) goto L27
        L49:
            android.graphics.Bitmap r0 = r3.LJJIIZI()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.like.LikeHelper.LJIILJJIL(java.lang.Boolean):android.graphics.Bitmap");
    }

    @Override // X.InterfaceC1085480eLy
    public final void LJIJ(C1088070eQ9 c1088070eQ9) {
        List<InterfaceC1086400eNS> list = this.LLLIIIIL;
        if (list != null) {
            ((ArrayList) list).remove(c1088070eQ9);
        }
    }

    @Override // X.InterfaceC1085480eLy
    public final void LJIJI(boolean z) {
        this.LLJJJIL = z;
    }

    @Override // X.InterfaceC1085480eLy
    public final void LJIL(InterfaceC1087920ePu interfaceC1087920ePu) {
        ((ArrayList) this.LLILZLL).remove(interfaceC1087920ePu);
    }

    public final Bitmap LJJIII(int i) {
        Bitmap bitmap = this.LLJZIJLIL.get(i);
        if (bitmap == null) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.LLILLJJLI.getResources(), i, this.LLJLIL);
            this.LLJZIJLIL.put(i, bitmapDecodeResource);
            return bitmapDecodeResource;
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap LJJIJIIJI(java.util.List<com.bytedance.android.live.base.model.ImageModel> r8) {
        /*
            r7 = this;
            r5 = 0
            if (r8 == 0) goto Lb8
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto Lb8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r8.iterator()
        L12:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r4 = r6.next()
            com.bytedance.android.live.base.model.ImageModel r4 = (com.bytedance.android.live.base.model.ImageModel) r4
            java.util.Map<java.lang.String, android.graphics.Bitmap> r1 = r7.LLLFFI
            java.lang.String r0 = r4.mUri
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L3c
            java.util.List<android.graphics.Bitmap> r2 = r7.LLLI
            java.util.Map<java.lang.String, android.graphics.Bitmap> r1 = r7.LLLFFI
            java.lang.String r0 = r4.mUri
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r0)
            goto L12
        L3c:
            X.11Kf r2 = X.C1121670fIL.LJ(r4)
            Y.AkS479S0100000_17 r1 = new Y.AkS479S0100000_17
            r0 = 11
            r1.<init>(r4, r0)
            X.11ON r0 = r2.LJJJJZI(r1)
            r3.add(r0)
            goto L12
        L4f:
            java.util.List<android.graphics.Bitmap> r0 = r7.LLLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L75
            java.util.List<android.graphics.Bitmap> r2 = r7.LLLI
            java.util.Random r1 = r7.LLL
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r0 = r1.nextInt(r0)
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.util.List<android.graphics.Bitmap> r0 = r7.LLLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
        L75:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lb6
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            X.11NZ r1 = X.C11NZ.LJJJLIIL(r3)
            X.0eQ1 r0 = new X.0eQ1
            r0.<init>()
            X.11Nk r1 = r1.LJJIL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r4 = r1.LJJJLZIJ(r0)
            Y.AfS186S0100000_17 r3 = new Y.AfS186S0100000_17
            r0 = 181(0xb5, float:2.54E-43)
            r3.<init>(r7, r0)
            Y.AfS49S1100000_17 r2 = new Y.AfS49S1100000_17
            r0 = 1
            r2.<init>(r7, r6, r0)
            X.0g4s r1 = new X.0g4s
            r0 = 1
            r1.<init>(r7, r6, r0)
            X.01kM r1 = r4.LJJZ(r3, r2, r1)
            java.util.Map<java.lang.String, X.01kM> r0 = r7.LLJLLL
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r6, r1)
        Lb6:
            if (r5 != 0) goto Lc4
        Lb8:
            android.graphics.Bitmap r5 = r7.LJJIIZI()
            int r0 = X.C1087930ePv.LIZLLL
            if (r0 < 0) goto Lc4
            int r0 = r0 + 1
            X.C1087930ePv.LIZLLL = r0
        Lc4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.like.LikeHelper.LJJIJIIJI(java.util.List):android.graphics.Bitmap");
    }

    @Override // X.InterfaceC1085480eLy
    public final void LIZLLL(View view, boolean z) {
        this.LLJLLIL = view;
        this.LLJJIII = 0.0f;
        this.LLJJIJI = 0.0f;
        if (view == null && !z) {
            C1CC2.LIZ("ttlive_like_target_view_null_exception", new Throwable());
        }
    }

    @Override // X.InterfaceC1085480eLy
    public final boolean LJIIIZ(float f, float f2) {
        View view;
        if (!LJJIIJZLJL() || !LJJIIZ() || !this.LLJILLL) {
            return false;
        }
        this.LLIZLLLIL++;
        this.LLJJI++;
        if (this.LLJJIII <= 0.0f && this.LLJJIJI <= 0.0f) {
            View view2 = this.LLJLLIL;
            if (view2 != null && view2.getMeasuredWidth() != 0 && this.LLJLLIL.getMeasuredHeight() != 0 && (view = this.LLJLL) != null && view.getMeasuredWidth() != 0 && this.LLJLL.getMeasuredHeight() != 0) {
                int[] iArr = new int[2];
                this.LLJLLIL.getLocationInWindow(iArr);
                if (iArr[0] <= C14KS.LJFF() && iArr[1] <= C14KS.LIZLLL()) {
                    int[] iArr2 = new int[2];
                    this.LLJLL.getLocationInWindow(iArr2);
                    int i = iArr[0] - iArr2[0];
                    int i2 = iArr[1] - iArr2[1];
                    this.LLJJIII = i + (this.LLJLLIL.getMeasuredWidth() / 2.0f);
                    this.LLJJIJI = i2 + (this.LLJLLIL.getMeasuredHeight() / 2.0f);
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (iArr[0] > C14KS.LJFF()) {
                        sb.append("targetViewPos[0] > ScreenUtils.getScreenWidth()");
                    } else if (iArr[1] > C14KS.LIZLLL()) {
                        sb.append("targetViewPos[1] > ScreenUtils.getScreenHeight()");
                    }
                    String string = sb.toString();
                    HashMap map = new HashMap();
                    map.put("reason", string);
                    C1CC2.LIZIZ("ttlive_like_collect_data_v2", new Throwable(), map);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                View view3 = this.LLJLLIL;
                if (view3 == null) {
                    sb2.append("targetView == null");
                } else if (view3.getMeasuredWidth() == 0) {
                    sb2.append("targetView.getMeasuredWidth() == 0");
                } else if (this.LLJLLIL.getMeasuredHeight() == 0) {
                    sb2.append("targetView.getMeasuredHeight() == 0");
                } else {
                    View view4 = this.LLJLL;
                    if (view4 == null) {
                        sb2.append("iconContainerView == null");
                    } else if (view4.getMeasuredWidth() == 0) {
                        sb2.append("iconContainerView.getMeasuredWidth() == 0");
                    } else if (this.LLJLL.getMeasuredHeight() == 0) {
                        sb2.append("iconContainerView.getMeasuredHeight() == 0");
                    }
                }
                String string2 = sb2.toString();
                HashMap map2 = new HashMap();
                map2.put("reason", string2);
                C1CC2.LIZIZ("ttlive_like_collect_data_v2", new Throwable(), map2);
            }
        }
        int i3 = this.LLIZ;
        int i4 = this.LLIZLLLIL;
        float f3 = this.LLJJIII;
        float f4 = this.LLJJIJI;
        if (LJJIIZ()) {
            LJJIJLIJ();
            if (!this.LLLIILIL) {
                IMessageManager iMessageManager = (IMessageManager) this.LLJLILLLLZIIL.gg0(C776250Uch.class);
                User userLIZIZ = C0KXJ.LIZIZ();
                if (iMessageManager != null && userLIZIZ != null && !LiveLikeDegradeSettings.INSTANCE.disableAvatarAnim(this.LLJLILLLLZIIL)) {
                    long id = this.LLILLL.getId();
                    CommonMessageData commonMessageData = new CommonMessageData();
                    commonMessageData.roomId = id;
                    commonMessageData.showMsg = true;
                    Boolean bool = Boolean.TRUE;
                    LikeMessage likeMessage = new LikeMessage(bool, userLIZIZ);
                    likeMessage.baseMessage = commonMessageData;
                    iMessageManager.insertMessage(likeMessage, true);
                    this.LLLIILIL = true;
                    this.LLJLILLLLZIIL.zW(SelfLikeTextMessageDisplayed.class, bool);
                }
            }
            for (InterfaceC1087920ePu interfaceC1087920ePu : (ArrayList) this.LLILZLL) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                interfaceC1087920ePu.Pb(this, i3, i4, f, f2, f3, f4);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String strJA = interfaceC1087920ePu.JA();
                HashMap<String, C1088010eQ3> map3 = C1087930ePv.LJIIIZ;
                if (!map3.containsKey(strJA)) {
                    map3.put(strJA, new C1088010eQ3());
                }
                C1088010eQ3 c1088010eQ3 = map3.get(strJA);
                if (c1088010eQ3 != null) {
                    c1088010eQ3.LIZIZ += jCurrentTimeMillis2;
                    c1088010eQ3.LIZJ++;
                    if (c1088010eQ3.LIZ < jCurrentTimeMillis2) {
                        c1088010eQ3.LIZ = jCurrentTimeMillis2;
                    }
                }
            }
        }
        this.LLLJIL.removeMessages(1);
        C786410Ut5.LJLJJI(1, this.LLJ, this.LLLJIL);
        DataChannel dataChannel = this.LLJLILLLLZIIL;
        if (dataChannel != null) {
            dataChannel.SX0(C781120UkY.class, Boolean.TRUE);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Boolean bool2 = (Boolean) dataChannelGlobal.gg0(GlobalLikeContinueTarget.class);
        if (bool2 == null || !bool2.booleanValue()) {
            dataChannelGlobal.HQ2(GlobalLikeContinueTarget.class, Boolean.TRUE);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.bytedance.android.livesdk.like.LikeApi] */
    public final void LJJIJIL(int i, int i2) {
        ?? Equals;
        boolean zLJI = MethodIDManager.LJI(202132);
        if (!LJJIIZ()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C0IXY c0ixyLIZIZ = C0IXW.LIZIZ(null, this.LLJLILLLLZIIL, "user_server_live_like");
        try {
            Equals = c0ixyLIZIZ.LIZ.equals("1");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Equals = 0;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        String str = (String) DataChannelGlobal.LLILZ.gg0(C1148270fzF.class);
        C480460Ism.LIZ().getClass();
        C11NZ c11nzLJIILIIL = ((LikeApi) C480460Ism.LIZLLL(LikeApi.class)).like(this.LLILLL.getId(), i, str, Long.valueOf(this.LLILLL.getOwnerUserId()), c0ixyLIZIZ.LJIIIZ, c0ixyLIZIZ.LJ, c0ixyLIZIZ.LJFF, c0ixyLIZIZ.LIZLLL, Equals, c0ixyLIZIZ.LJIIIIZZ, c0ixyLIZIZ.LJIIJ, c0ixyLIZIZ.LIZJ, "live_ad", c0ixyLIZIZ.LIZIZ, i2).LJIILIIL(C0J1R.LIZJ(LikeApi.class));
        final C1087970ePz c1087970ePz = new C1087970ePz();
        SystemClock.elapsedRealtime();
        LiveLikeRequestOptSetting liveLikeRequestOptSetting = LiveLikeRequestOptSetting.INSTANCE;
        if (liveLikeRequestOptSetting.enableRetryRequest()) {
            c11nzLJIILIIL = c11nzLJIILIIL.LJJLIIIJLJLI(new C1088040eQ6(c1087970ePz));
        }
        if (liveLikeRequestOptSetting.enableExitRoomRequest()) {
            Room room = this.LLILLL;
            String strValueOf = String.valueOf(room.getOwnerUserId());
            int i3 = C463640IGc.LIZ;
            c1087970ePz.LIZIZ = "tap";
            c1087970ePz.LIZJ = i;
            c1087970ePz.LIZLLL = room;
            c1087970ePz.LJ = strValueOf;
            c1087970ePz.LJFF = jUptimeMillis;
            c1087970ePz.LJI = i3;
            c1087970ePz.LJII = i2;
            c11nzLJIILIIL = C476120Ilm.LIZ(c11nzLJIILIIL, new InterfaceC475810IlH<BaseResponse<LikeResponse.Data, LikeApi.LikeExtra>>(c1087970ePz) { // from class: X.0ePw
                public final C1087970ePz LIZ;

                @Override // X.InterfaceC475810IlH
                public final void LIZ(Map<String, ?> map) {
                }

                {
                    this.LIZ = c1087970ePz;
                }

                @Override // X.InterfaceC475810IlH
                public final void LIZIZ(BaseResponse<LikeResponse.Data, LikeApi.LikeExtra> baseResponse, Map map) {
                    C1087970ePz c1087970ePz2 = this.LIZ;
                    if (c1087970ePz2 != null) {
                        C1087930ePv.LIZIZ(c1087970ePz2.LIZIZ, c1087970ePz2.LIZJ, c1087970ePz2.LIZLLL, c1087970ePz2.LJ, c1087970ePz2.LJFF, c1087970ePz2.LJI, c1087970ePz2.LJII, 1, 0);
                    }
                }
            }, null);
        }
        ((C0J1N) c11nzLJIILIIL.LIZJ(C11RD.LJ(this.LL))).LIZ(new AfS1S0102100_17(this, i, jUptimeMillis, i2, 0), new AfS1S0102100_17(this, i, jUptimeMillis, i2, 1));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x04c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(int r20, long r21, boolean r23) {
        /*
            Method dump skipped, instruction units count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.like.LikeHelper.LJJIJL(int, long, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a5  */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, com.bytedance.android.livesdk.like.LikeIconResult] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LikeHelper(X.C19EG r21, androidx.lifecycle.LifecycleOwner r22, final com.bytedance.android.livesdkapi.depend.model.live.Room r23, final boolean r24, final boolean r25, final com.bytedance.ies.sdk.datachannel.DataChannel r26) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.like.LikeHelper.<init>(X.19EG, androidx.lifecycle.LifecycleOwner, com.bytedance.android.livesdkapi.depend.model.live.Room, boolean, boolean, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static void LJJIJIIJIL(Exception exc, String str, int i, Room room, String str2, long j, int i2, int i3) {
        int statusCode;
        if (exc instanceof C501520Jle) {
            statusCode = ((C501520Jle) exc).getErrorCode();
        } else if (exc instanceof C1494690ozz) {
            statusCode = ((C1494690ozz) exc).getStatusCode();
        } else if (exc instanceof C1811850xFX) {
            statusCode = ((C1811850xFX) exc).statusCode;
        } else {
            statusCode = -100;
        }
        HashMap map = new HashMap();
        map.put("error_code", String.valueOf(statusCode));
        map.put("error_msg", exc.getMessage());
        C1CC2.LIZIZ("ttlive_like_request_error", new Throwable(), map);
        C1087930ePv.LIZIZ(str, i, room, str2, j, i2, i3, 0, statusCode);
    }
}
