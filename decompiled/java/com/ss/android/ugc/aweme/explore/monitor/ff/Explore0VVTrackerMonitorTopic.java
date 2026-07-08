package com.ss.android.ugc.aweme.explore.monitor.ff;

import X.C0AB2;
import X.C15UD;
import X.C15UE;
import X.C15UL;
import X.C15UQ;
import X.C1697810uHb;
import X.C1848630yCr;
import X.C2188811AlT;
import X.InterfaceC1848620yCq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class Explore0VVTrackerMonitorTopic implements InterfaceC1848620yCq {
    public C15UQ data;
    public final String eventName = "leave_homepage_explore_topic";
    public final List<C15UL> finalDataStatus = C1697810uHb.LJIIJJI(C15UL.SHOWING_REQUEST_DATA, C15UL.SHOWING_FAKE_REFRESH_DATA, C15UL.SHOWING_PRELOADING_DATA, C15UL.SHOWING_HOT_CACHE_DATA);
    public boolean hasReported;
    public String insertSource;
    public boolean isInBackground;
    public boolean isInExplorePage;
    public String specialShapedCardTriggerType;
    public final long topicId;
    public String topicName;

    public final void clearData$explore_release() {
        this.data = null;
        this.topicName = null;
        this.insertSource = null;
        this.specialShapedCardTriggerType = null;
        this.isInExplorePage = false;
        this.isInBackground = false;
        this.hasReported = false;
    }

    public final synchronized String getInsertSource() {
        return this.insertSource;
    }

    public final synchronized String getSpecialShapedCardTriggerType() {
        return this.specialShapedCardTriggerType;
    }

    public final synchronized String getTopicName() {
        return this.topicName;
    }

    public final Explore0VVTrackerMonitorTopic isCustomFeedEnable(boolean z) {
        return this;
    }

    public final synchronized boolean isInBackground$explore_release() {
        return this.isInBackground;
    }

    public final synchronized boolean isInExplorePage() {
        return this.isInExplorePage;
    }

    public final Explore0VVTrackerMonitorTopic isTopicPage(boolean z) {
        return this;
    }

    public final Explore0VVTrackerMonitorTopic reportedCurrentTopicShow(boolean z) {
        return this;
    }

    public final void report() throws JSONException {
        if (((Number) C0AB2.LIZ.getValue()).intValue() == 1 && this.isInExplorePage && !this.isInBackground) {
            if (this.hasReported) {
                this.isInExplorePage = false;
                return;
            }
            C15UQ c15uq = this.data;
            if (c15uq != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("enter_from", c15uq.LIZ);
                jSONObject.putOpt("enter_method", c15uq.LIZIZ);
                jSONObject.putOpt("is_first_enter", Integer.valueOf(c15uq.LIZJ ? 1 : 0));
                jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - c15uq.LIZLLL));
                jSONObject.putOpt("reported_show_explore_card", Integer.valueOf(c15uq.LJ ? 1 : 0));
                jSONObject.putOpt("showing_cache_explore_card", Integer.valueOf(c15uq.LJFF ? 1 : 0));
                jSONObject.putOpt("has_clicked_card", Integer.valueOf(c15uq.LJI ? 1 : 0));
                jSONObject.putOpt("leave_reason", c15uq.LJII);
                jSONObject.putOpt("valid_data_status", c15uq.LJIIIIZZ.getStatus());
                jSONObject.putOpt("err_extra", c15uq.LJIIIZ);
                jSONObject.putOpt("topic_id", Long.valueOf(this.topicId));
                jSONObject.putOpt("topic_name", this.topicName);
                jSONObject.putOpt("insert_source", this.insertSource);
                jSONObject.putOpt("special_shaped_card_trigger_type", this.specialShapedCardTriggerType);
                monitorEvent(jSONObject);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(getEventName());
                sbLIZ.append(' ');
                sbLIZ.append(jSONObject);
                recordLog(C2188811AlT.LIZIZ(sbLIZ));
                this.hasReported = true;
            }
            C15UQ c15uq2 = this.data;
            if (c15uq2 != null) {
                c15uq2.LIZJ = false;
                c15uq2.LJI = false;
            }
            this.isInExplorePage = false;
        }
    }

    @Override // X.InterfaceC1848620yCq
    public String getEventName() {
        return this.eventName;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    public Explore0VVTrackerMonitorTopic(long j) {
        this.topicId = j;
    }

    public final Explore0VVTrackerMonitorTopic dataStatus(C15UL c15ul) {
        C15UL c15ul2;
        C15UQ c15uq;
        List<C15UL> list = this.finalDataStatus;
        C15UQ c15uq2 = this.data;
        if (c15uq2 == null || (c15ul2 = c15uq2.LJIIIIZZ) == null) {
            c15ul2 = C15UL.IDLE;
        }
        if (!list.contains(c15ul2) && (c15uq = this.data) != null) {
            c15uq.LJIIIIZZ = c15ul;
        }
        return this;
    }

    public final Explore0VVTrackerMonitorTopic errorExtra(Map<String, String> map) {
        C15UQ c15uq = this.data;
        if (c15uq != null) {
            c15uq.LJIIIZ = map.toString();
        }
        return this;
    }

    public final Explore0VVTrackerMonitorTopic hasClickedCard(boolean z) {
        C15UQ c15uq = this.data;
        if (c15uq != null) {
            c15uq.LJI = z;
        }
        return this;
    }

    public final Explore0VVTrackerMonitorTopic leaveReason(C15UD c15ud) {
        C15UQ c15uq = this.data;
        if (c15uq != null) {
            c15uq.LJII = c15ud.getReason();
        }
        return this;
    }

    public void monitorEvent(JSONObject jSONObject) {
        C1848630yCr.LIZ(this, jSONObject);
    }

    public void recordLog(String str) {
        C1848630yCr.LIZIZ(this, str);
    }

    public final synchronized void setInBackground$explore_release(boolean z) {
        this.isInBackground = z;
    }

    public final Explore0VVTrackerMonitorTopic setTopicName(String str) {
        if (str != null && str.length() != 0) {
            this.topicName = str;
        }
        return this;
    }

    public final Explore0VVTrackerMonitorTopic start(String str) {
        String str2;
        if (this.data == null) {
            C15UQ c15uq = new C15UQ();
            c15uq.LJIIIIZZ = C15UL.IDLE;
            this.data = c15uq;
        }
        if (this.isInExplorePage) {
            C15UQ c15uq2 = this.data;
            if (c15uq2 != null) {
                str2 = c15uq2.LIZIZ;
            } else {
                str2 = null;
            }
            C15UE c15ue = C15UE.OTHER;
            if (!Intrinsics.LJFF(str2, c15ue.getValue()) && Intrinsics.LJFF(str, c15ue.getValue())) {
                return this;
            }
        }
        C15UQ c15uq3 = this.data;
        if (c15uq3 != null) {
            c15uq3.LIZIZ = str;
            c15uq3.LIZLLL = System.currentTimeMillis();
        }
        this.isInExplorePage = true;
        return this;
    }

    public final Explore0VVTrackerMonitorTopic setSchemaContext(String str, String str2) {
        this.insertSource = str;
        this.specialShapedCardTriggerType = str2;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r5.intValue() == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitorTopic showingCard(java.lang.Boolean r4, java.lang.Integer r5) {
        /*
            r3 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            r2 = 1
            if (r0 == 0) goto L6d
            X.15UQ r0 = r3.data
            if (r0 == 0) goto Lf
            r0.LJFF = r2
        Lf:
            X.15TI r0 = X.C15TI.FAKE_REFRESH
            int r1 = r0.getValue()
            if (r5 == 0) goto L23
            int r0 = r5.intValue()
            if (r0 != r1) goto L23
            X.15UL r0 = X.C15UL.SHOWING_FAKE_REFRESH_DATA
            r3.dataStatus(r0)
        L22:
            return r3
        L23:
            X.15TI r0 = X.C15TI.PRELOAD
            int r1 = r0.getValue()
            if (r5 == 0) goto L37
            int r0 = r5.intValue()
            if (r0 != r1) goto L37
            X.15UL r0 = X.C15UL.SHOWING_PRELOADING_DATA
            r3.dataStatus(r0)
            return r3
        L37:
            X.15TI r0 = X.C15TI.HOT_CACHE
            int r1 = r0.getValue()
            if (r5 == 0) goto L4b
            int r0 = r5.intValue()
            if (r0 != r1) goto L4b
            X.15UL r0 = X.C15UL.SHOWING_HOT_CACHE_DATA
            r3.dataStatus(r0)
            return r3
        L4b:
            X.15TI r0 = X.C15TI.REFRESH
            int r1 = r0.getValue()
            if (r5 == 0) goto L59
            int r0 = r5.intValue()
            if (r0 == r1) goto L67
        L59:
            X.15TI r0 = X.C15TI.LOADMORE
            int r1 = r0.getValue()
            if (r5 == 0) goto L22
            int r0 = r5.intValue()
            if (r0 != r1) goto L22
        L67:
            X.15UL r0 = X.C15UL.SHOWING_REQUEST_DATA
            r3.dataStatus(r0)
            return r3
        L6d:
            X.15UQ r1 = r3.data
            if (r1 == 0) goto Lf
            r0 = 0
            r1.LJFF = r0
            r1.LJ = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitorTopic.showingCard(java.lang.Boolean, java.lang.Integer):com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitorTopic");
    }
}
