package com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal;

import X.C09CT;
import X.C1CC2;
import X.C2180911AWz;
import X.C2181101AXs;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutSlardarCombineSetting;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class LayoutSlardarMonitor {
    public final C2181101AXs LIZ;
    public long LIZIZ;
    public String LIZJ = "";
    public String LIZLLL = "";
    public long LJ = -1;
    public int LJFF;

    public static final class BizWindow {

        @C09CT("audio_mute")
        public final int audioStatus;

        @C09CT("h")
        public final int h;

        @C09CT("linkmic_id")
        public final String linkMicId;

        @C09CT("logic_pos")
        public final int logicPos;

        @C09CT("type")
        public final int type;

        @C09CT("ui_pos")
        public final int uiPos;

        @C09CT("uid")
        public final long uid;

        @C09CT("video_mute")
        public final int videoStatus;

        @C09CT("w")
        public final int w;

        @C09CT("x")
        public final int x;

        @C09CT("y")
        public final int y;

        public BizWindow() {
            this(-1, -1L, "", -1, -1, -1, -1, -1, -1, -1, -1);
        }

        public BizWindow(int i, long j, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.type = i;
            this.uid = j;
            this.linkMicId = str;
            this.uiPos = i2;
            this.logicPos = i3;
            this.audioStatus = i4;
            this.videoStatus = i5;
            this.x = i6;
            this.y = i7;
            this.w = i8;
            this.h = i9;
        }
    }

    public LayoutSlardarMonitor(C2181101AXs c2181101AXs) {
        this.LIZ = c2181101AXs;
    }

    public static void LIZLLL(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1CC2.LIZ("LayoutSlardarMonitor Error", th);
        }
    }

    public final JSONObject LIZ(String str) throws JSONException {
        String str2;
        JSONObject jSONObject = new JSONObject();
        int i = this.LIZ.LJ;
        if (i != 0) {
            if (i != 2) {
                if (i != 4) {
                    str2 = "";
                } else {
                    str2 = "multi-guest";
                }
            } else {
                str2 = "multi-host";
            }
        } else {
            str2 = "union";
        }
        jSONObject.put("event_id", str);
        jSONObject.put("uid", this.LIZ.LIZ);
        jSONObject.put("linkmic_id", this.LIZ.LIZIZ.invoke());
        jSONObject.put("room_id", this.LIZ.LIZLLL);
        jSONObject.put("live_type", this.LIZ.LJFF);
        jSONObject.put("channel_id", this.LJ);
        jSONObject.put("role", this.LIZ.LIZJ.invoke());
        jSONObject.put(Scene.SCENE_SERVICE, str2);
        jSONObject.put("source", this.LIZ.LJII);
        jSONObject.put("layout_change_times", this.LIZIZ);
        jSONObject.put("layout_version", this.LJFF);
        jSONObject.put("to_layout_id", this.LIZJ);
        jSONObject.put("layout_data", this.LIZLLL);
        return jSONObject;
    }

    public final void LIZJ(ViewGroup.LayoutParams layoutParams, List<C2180911AWz> list, final String str) {
        final Container container;
        if (!LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutMeasureReportEnable()) {
            return;
        }
        new Container(-1, -1, -1, -1);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            container = new Container(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.width, marginLayoutParams.height);
        } else {
            container = new Container(-1, -1, -1, -1);
        }
        final ArrayList arrayList = new ArrayList();
        for (C2180911AWz c2180911AWz : (ArrayList) list) {
            int i = c2180911AWz.LIZ;
            Rect rect = c2180911AWz.LJI;
            arrayList.add(new Window(i, rect.left, rect.top, rect.width(), c2180911AWz.LJI.height()));
        }
        LIZLLL(new Runnable() { // from class: X.1AXY
            public final void LIZ() throws JSONException {
                if (LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutMeasureReportEnable()) {
                    ViewGroup viewGroupInvoke = this.LL.LIZ.LJI.invoke();
                    LayoutSlardarMonitor.Container container2 = viewGroupInvoke == null ? new LayoutSlardarMonitor.Container(-1, -1, -1, -1) : new LayoutSlardarMonitor.Container(viewGroupInvoke.getLeft(), viewGroupInvoke.getTop(), viewGroupInvoke.getWidth(), viewGroupInvoke.getHeight());
                    JSONObject jSONObjectLIZ = this.LL.LIZ("linkmic_layout_measure");
                    LayoutSlardarMonitor.Container container3 = container;
                    List<LayoutSlardarMonitor.Window> list2 = arrayList;
                    String str2 = str;
                    try {
                        Gson gson = C19748512Ol.LIZIZ;
                        jSONObjectLIZ.put("real_container", new JSONObject(gson.LJIILL(container2)));
                        jSONObjectLIZ.put("measured_container", new JSONObject(gson.LJIILL(container3)));
                        jSONObjectLIZ.put("windows", new JSONArray(gson.LJIILL(list2)));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    jSONObjectLIZ.put("hash", str2);
                    C1CC2.LJIIIIZZ("ttlive_link_interact_layout_event_monitor", 0, jSONObjectLIZ);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LayoutSlardarMonitor@96d1.onLayoutMeasure$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LayoutSlardarMonitor@96d1.onLayoutMeasure$1");
            }
        });
    }

    public static final class Container {

        @C09CT("h")
        public final int h;

        @C09CT("w")
        public final int w;

        @C09CT("x")
        public final int x;

        @C09CT("y")
        public final int y;

        public Container() {
            this(-1, -1, -1, -1);
        }

        public Container(int i, int i2, int i3, int i4) {
            this.x = i;
            this.y = i2;
            this.w = i3;
            this.h = i4;
        }
    }

    public static final class Window {

        @C09CT("h")
        public final int h;

        @C09CT("pos")
        public final int pos;

        @C09CT("w")
        public final int w;

        @C09CT("x")
        public final int x;

        @C09CT("y")
        public final int y;

        public Window() {
            this(-1, -1, -1, -1, -1);
        }

        public Window(int i, int i2, int i3, int i4, int i5) {
            this.pos = i;
            this.x = i2;
            this.y = i3;
            this.w = i4;
            this.h = i5;
        }
    }

    public final void LIZIZ(final boolean z, final Long l, final String str, final Integer num, final Integer num2, final boolean z2, final String str2) {
        LIZLLL(new Runnable() { // from class: X.1AXe
            public final void LIZ() throws JSONException {
                if (LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutGuestChangeReportEnable()) {
                    JSONObject jSONObjectLIZ = this.LL.LIZ("linkmic_guest_change");
                    boolean z3 = z;
                    Long l2 = l;
                    String str3 = str;
                    Integer num3 = num;
                    Integer num4 = num2;
                    String str4 = str2;
                    boolean z4 = z2;
                    jSONObjectLIZ.put("opt", z3 ? "1" : CardStruct.IStatusCode.DEFAULT);
                    jSONObjectLIZ.put("changed_uid", l2);
                    jSONObjectLIZ.put("changed_linkmic_id", str3);
                    jSONObjectLIZ.put("changed_logic_pos", num3);
                    jSONObjectLIZ.put("changed_ui_pos", num4);
                    jSONObjectLIZ.put("hash", str4);
                    jSONObjectLIZ.put("in_linked_list", z4 ? "1" : CardStruct.IStatusCode.DEFAULT);
                    C1CC2.LJIIIIZZ("ttlive_link_interact_layout_event_monitor", 0, jSONObjectLIZ);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LayoutSlardarMonitor@96d1.onGuestChange$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LayoutSlardarMonitor@96d1.onGuestChange$1");
            }
        });
    }

    public static final class Player {

        @C09CT("excepted_h")
        public final int exceptedH;

        @C09CT("excepted_w")
        public final int exceptedW;

        @C09CT("excepted_x")
        public final int exceptedX;

        @C09CT("excepted_y")
        public final int exceptedY;

        @C09CT("origin_h")
        public final int originH;

        @C09CT("origin_w")
        public final int originW;

        @C09CT("real_h")
        public final int realH;

        @C09CT("real_w")
        public final int realW;

        @C09CT("real_x")
        public final int realX;

        @C09CT("real_y")
        public final int realY;

        public Player() {
            this(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
        }

        public Player(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.originW = i;
            this.originH = i2;
            this.exceptedX = i3;
            this.exceptedY = i4;
            this.exceptedW = i5;
            this.exceptedH = i6;
            this.realX = i7;
            this.realY = i8;
            this.realW = i9;
            this.realH = i10;
        }
    }
}
