package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.AnonymousClass0956;
import X.C0J39;
import X.C0KYM;
import X.C0PEM;
import X.C1097990eg9;
import X.C1098010egB;
import X.C1161920gLG;
import X.C13LE;
import X.C13LP;
import X.C1548820qPI;
import X.C20736316Cj;
import X.C2097608Jq;
import X.C23250099c;
import X.C262100zr;
import X.C344401Vi;
import X.C418440Gaw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5183020f;
import X.C770220UJg;
import X.C781520UlC;
import X.C786410Ut5;
import X.InterfaceC1141530foN;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewOnLayoutChangeListenerC1090010eTH;
import Y.ARunnableS6S0102000_17;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.BroadcastPreviewBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AwS596S0100000_17;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class BroadcastPreviewBannerWidget extends BannerWidget implements InterfaceC1141530foN {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJI;
    public FrameLayout LLJIJIL;
    public Integer LLJILJIL;
    public BannerInRoomCollection.BannerInfo LLJILJILJ;
    public ViewOnLayoutChangeListenerC1090010eTH LLJJIJI;
    public AnonymousClass0956 LLJJIJIIJIL;
    public boolean LLJJJ;
    public boolean LLJILLL = true;
    public final HashMap<String, Boolean> LLJJ = new HashMap<>();
    public final HashMap<String, ArrayList<BannerInRoom>> LLJJI = new HashMap<>();
    public ArrayList<BannerInRoom> LLJJIII = new ArrayList<>();
    public final int LLJJIJIL = (int) C497740JfY.LIZIZ(54.0f);
    public final String LLJJJIL = "custom_banner";

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
        FrameLayout frameLayout = this.LLJIJIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxp;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(BroadcastPreviewBannerChannel.class));
        FrameLayout frameLayout = this.LLJIJIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        C1097990eg9.LIZIZ = null;
        C1548820qPI.LJIIIIZZ("js_event_banner_ready_live", this);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLJIJIL = (FrameLayout) findViewById(R.id.vsu);
        HashMap<String, Boolean> map = this.LLJJ;
        LiveMode liveMode = LiveMode.SCREEN_RECORD;
        String str = liveMode.logStreamingType;
        Boolean bool = Boolean.FALSE;
        map.put(str, bool);
        HashMap<String, Boolean> map2 = this.LLJJ;
        LiveMode liveMode2 = LiveMode.VIDEO;
        map2.put(liveMode2.logStreamingType, bool);
        HashMap<String, Boolean> map3 = this.LLJJ;
        LiveMode liveMode3 = LiveMode.THIRD_PARTY;
        map3.put(liveMode3.logStreamingType, bool);
        HashMap<String, Boolean> map4 = this.LLJJ;
        LiveMode liveMode4 = LiveMode.LIVE_STUDIO;
        map4.put(liveMode4.logStreamingType, bool);
        this.LLJJI.put(liveMode.logStreamingType, new ArrayList<>());
        this.LLJJI.put(liveMode2.logStreamingType, new ArrayList<>());
        this.LLJJI.put(liveMode3.logStreamingType, new ArrayList<>());
        this.LLJJI.put(liveMode4.logStreamingType, new ArrayList<>());
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new C5183020f(this, 153));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        FrameLayout frameLayout = this.LLJIJIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        C1097990eg9.LIZIZ = null;
        C1548820qPI.LJIIIIZZ("js_event_banner_ready_live", this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() throws JSONException {
        super.onPause();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, "container_disappear", new JSONObject());
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put("args", new JSONObject().put("foreground", false));
            C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, "H5_appStateChange", jSONObject);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() throws JSONException {
        super.onResume();
        if (!this.LLJILLL) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, "container_appear", new JSONObject());
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "app");
                jSONObject.put("args", new JSONObject().put("foreground", true));
                C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, "H5_appStateChange", jSONObject);
            }
        }
        this.LLJILLL = false;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() throws JSONException {
        BannerInRoom bannerInRoom;
        Long l;
        View view;
        FrameLayout frameLayout;
        BannerInRoom bannerInRoom2;
        Long l2;
        View view2;
        super.onShow();
        ArrayList<BannerInRoom> arrayList = this.LLJJI.get(this.LLILZIL);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.LLJJIII = arrayList;
        if (!C500260Jjc.LJJJI(Boolean.valueOf(!arrayList.isEmpty()))) {
            hide();
            return;
        }
        show();
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(BroadcastPreviewBannerChannel.class));
        FrameLayout frameLayout2 = this.LLJIJIL;
        if (frameLayout2 == null || frameLayout2.getChildCount() <= 0) {
            C1548820qPI.LIZLLL("js_event_banner_ready_live", this);
            BannerInRoomCollection.BannerInfo bannerInfo = this.LLJILJILJ;
            if (bannerInfo == null) {
                return;
            }
            C1098010egB c1098010egBLIZIZ = C1097990eg9.LIZIZ();
            c1098010egBLIZIZ.LIZ("live_take_page", "event_page");
            c1098010egBLIZIZ.LIZ(0, "render_strategy");
            c1098010egBLIZIZ.LJIIL = 0;
            c1098010egBLIZIZ.LIZJ(this.LLJJIII.size(), this.LLJJIII.size());
            ArrayList<BannerInRoom> arrayList2 = this.LLJJIII;
            JSONArray jSONArray = new JSONArray();
            Iterator<BannerInRoom> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                jSONArray = jSONArray.put(it2.next().id);
            }
            String string = jSONArray.toString();
            ArrayList<BannerInRoom> arrayList3 = this.LLJJIII;
            JSONArray jSONArray2 = new JSONArray();
            Iterator<BannerInRoom> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                jSONArray2 = jSONArray2.put(it3.next().id);
            }
            String string2 = jSONArray2.toString();
            c1098010egBLIZIZ.LIZ(string, "origin_banner_ids");
            c1098010egBLIZIZ.LIZ(string2, "render_banner_ids");
            FrameLayout frameLayout3 = this.LLJIJIL;
            if (frameLayout3 != null) {
                C786410Ut5.LJJJJIZL(frameLayout3);
            }
            String str = bannerInfo.lynxContainerUrl;
            C0KYM c0kym = new C0KYM();
            c0kym.LJI(str);
            c0kym.LIZIZ.authority("lynxview");
            c0kym.LJFF(true);
            String string3 = c0kym.LIZ().toString();
            C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
            C1098010egB c1098010egBLIZIZ2 = C1097990eg9.LIZIZ();
            c1098010egBLIZIZ2.LJ = "lynx";
            c1098010egBLIZIZ2.LJII = System.currentTimeMillis();
            c1098010egBLIZIZ2.LIZLLL = str;
            c1098010egBLIZIZ2.LIZJ = string3;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(this.context, string3, null, true, new AwS596S0100000_17(this, 299));
            C1097990eg9.LIZIZ().LJIIIIZZ = System.currentTimeMillis();
            c1097990eg9.LIZLLL(C2097608Jq.LJ());
            this.LLJI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.setBackgroundColor(C497740JfY.LJFF(R.color.a1d));
            }
            this.LLJJJ = false;
            if (C781520UlC.LJIIJJI((LiveMode) this.dataChannel.gg0(LiveModeChannel.class)) && (bannerInRoom2 = (BannerInRoom) C13LP.LJJJLL(this.LLJJIII)) != null && (l2 = bannerInRoom2.businessType) != null && l2.longValue() == 1) {
                BannerInRoom bannerInRoom3 = (BannerInRoom) C13LP.LJJJLL(this.LLJJIII);
                int i = bannerInRoom3 != null ? bannerInRoom3.width : 0;
                BannerInRoom bannerInRoom4 = (BannerInRoom) C13LP.LJJJLL(this.LLJJIII);
                int i2 = bannerInRoom4 != null ? bannerInRoom4.height : 0;
                if (i > 0 && i2 > 0 && (view2 = getView()) != null) {
                    HandlerHook.viewPost(view2, new ARunnableS6S0102000_17(this, i2, i, 2));
                }
            }
            AnchorPreviewUniformStyleABSetting anchorPreviewUniformStyleABSetting = AnchorPreviewUniformStyleABSetting.INSTANCE;
            if (anchorPreviewUniformStyleABSetting.enable() && ((C781520UlC.LJI(this.LLJ) || C781520UlC.LJIIIZ(this.LLJ)) && (frameLayout = this.LLJIJIL) != null)) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(12));
                gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exe, frameLayout.getContext()));
                frameLayout.setBackground(gradientDrawable);
                frameLayout.setClipToOutline(true);
            }
            if (anchorPreviewUniformStyleABSetting.enable() && (C781520UlC.LJI(this.LLJ) || C781520UlC.LJIIIZ(this.LLJ))) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(66.0f));
                FrameLayout frameLayout4 = this.LLJIJIL;
                if (frameLayout4 != null) {
                    frameLayout4.addView(this.LLJI, marginLayoutParams);
                }
            } else {
                FrameLayout frameLayout5 = this.LLJIJIL;
                if (frameLayout5 != null) {
                    frameLayout5.addView(this.LLJI, -1, -1);
                }
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, "container_appear", new JSONObject());
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "app");
                jSONObject.put("args", new JSONObject().put("foreground", true));
                C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, "H5_appStateChange", jSONObject);
            }
            LiveIconView liveIconView = (LiveIconView) findViewById(R.id.br9);
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 0);
                C500260Jjc.LJLIIIL(500L, liveIconView, new AwS596S0100000_17(this, 93));
            }
            if (!C781520UlC.LJIIJJI((LiveMode) this.dataChannel.gg0(LiveModeChannel.class)) || (bannerInRoom = (BannerInRoom) C13LP.LJJJLL(this.LLJJIII)) == null || (l = bannerInRoom.businessType) == null || l.longValue() != 1) {
                return;
            }
            if (!this.LLJJJ) {
                View view3 = getView();
                if (view3 != null) {
                    C500260Jjc.LJIILLIIL(view3);
                }
                AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C344401Vi(this, null), 2);
                this.LLJJIJIIJIL = anonymousClass0956LIZLLL;
                anonymousClass0956LIZLLL.start();
            }
            BannerInRoom bannerInRoom5 = (BannerInRoom) C13LP.LJJJLL(this.LLJJIII);
            int i3 = bannerInRoom5 != null ? bannerInRoom5.width : 0;
            BannerInRoom bannerInRoom6 = (BannerInRoom) C13LP.LJJJLL(this.LLJJIII);
            int i4 = bannerInRoom6 != null ? bannerInRoom6.height : 0;
            if (i3 <= 0 || i4 <= 0 || (view = getView()) == null) {
                return;
            }
            HandlerHook.viewPost(view, new ARunnableS6S0102000_17(this, i4, i3, 3));
        }
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJJJIL;
    }

    public final void N1(int i) {
        ViewGroup.LayoutParams layoutParams;
        this.LLJILJIL = Integer.valueOf(i);
        FrameLayout frameLayout = this.LLJIJIL;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.LLJILJIL.intValue();
            }
        } else {
            layoutParams = null;
        }
        FrameLayout frameLayout2 = this.LLJIJIL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1097990eg9.LIZIZ().LJIIJJI = System.currentTimeMillis();
        c1097990eg9.LJI();
    }

    public final void O1(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        this.LLJILJIL = Integer.valueOf(i2);
        View view = getView();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
            }
        } else {
            layoutParams = null;
        }
        FrameLayout frameLayout = this.LLJIJIL;
        if (frameLayout != null && (layoutParams2 = frameLayout.getLayoutParams()) != null) {
            layoutParams2.width = i;
            layoutParams2.height = this.LLJILJIL.intValue();
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.W5(view2, layoutParams);
        }
        FrameLayout frameLayout2 = this.LLJIJIL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams2);
        }
    }
}
