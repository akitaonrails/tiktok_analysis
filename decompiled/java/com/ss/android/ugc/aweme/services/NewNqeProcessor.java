package com.ss.android.ugc.aweme.services;

import X.C08FF;
import X.C13LP;
import X.C1697810uHb;
import X.C2187451AjH;
import X.C2254308sP;
import X.C310360CEo;
import X.C814420VxA;
import X.InterfaceC2044707zh;
import X.InterfaceC2184631Aej;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.Collections;
import java.util.List;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes36.dex */
public final class NewNqeProcessor {
    public static final NewNqeProcessor INSTANCE;
    public static volatile Page currentPage;
    public static float defaultWeightMIONqe;
    public static float defaultWeightTTNetNqe;
    public static volatile int lastCombineNqe;
    public static volatile int lastLiveNqe;
    public static volatile int lastTTNetNqe;
    public static volatile int lastVodNqe;
    public static final List<String> livePlayPageList;
    public static final NQECombinerEWMA nqeCombiner;
    public static final List<String> vodPlayPageList;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Page {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Page[] $VALUES;
        public static final Page DEFAULT = new Page(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        public static final Page VOD = new Page("VOD", 1);
        public static final Page LIVE = new Page("LIVE", 2);

        public static final /* synthetic */ Page[] $values() {
            return new Page[]{DEFAULT, VOD, LIVE};
        }

        public static InterfaceC2044707zh<Page> getEntries() {
            return $ENTRIES;
        }

        static {
            Page[] pageArr$values = $values();
            $VALUES = pageArr$values;
            $ENTRIES = new C2254308sP(pageArr$values);
        }

        public static Page[] values() {
            return (Page[]) $VALUES.clone();
        }

        public static Page valueOf(String str) {
            return (Page) C08FF.LIZ(Page.class, str);
        }

        public Page(String str, int i) {
        }
    }

    private final int convertTTNetNqe(int i) {
        switch (i) {
            case -1:
            case 1:
                return -1;
            case 0:
            default:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
            case 7:
            case 8:
                return 5;
        }
    }

    static {
        NewNqeProcessor newNqeProcessor = new NewNqeProcessor();
        INSTANCE = newNqeProcessor;
        currentPage = Page.DEFAULT;
        vodPlayPageList = C1697810uHb.LJIIJJI("SocialFriendsFeedFragment", "FeedRecommendFragment", "FeedFollowFragment");
        livePlayPageList = Collections.singletonList("LivePlayActivity");
        defaultWeightTTNetNqe = 1.0f;
        nqeCombiner = new NQECombinerEWMA(0.3d, 0.5d);
        C2187451AjH.LJIIZILJ(new InterfaceC2184631Aej() { // from class: com.ss.android.ugc.aweme.services.NewNqeProcessor.1
            @Override // X.InterfaceC2184631Aej
            public final void onFragmentChange(String str, String str2, boolean z) {
                NewNqeProcessor newNqeProcessor2 = NewNqeProcessor.INSTANCE;
                NewNqeProcessor.currentPage = newNqeProcessor2.getPageByName(str2);
                newNqeProcessor2.updateWeightByPage();
            }
        });
        currentPage = newNqeProcessor.getPageByName(C2187451AjH.LJIIIZ);
        newNqeProcessor.updateWeightByPage();
    }

    private final int updateCombineNqe() {
        int iCombineNqe = currentPage == Page.VOD ? combineNqe(lastTTNetNqe, lastVodNqe) : currentPage == Page.LIVE ? combineNqe(lastTTNetNqe, lastLiveNqe) : lastTTNetNqe;
        updateNetworkLevel(iCombineNqe);
        return iCombineNqe;
    }

    public final void updateWeightByPage() {
        if (currentPage == Page.VOD || currentPage == Page.LIVE) {
            defaultWeightTTNetNqe = 0.2f;
            defaultWeightMIONqe = 0.8f;
        } else {
            defaultWeightTTNetNqe = 1.0f;
            defaultWeightMIONqe = 0.0f;
        }
    }

    public static final class NQECombinerEWMA {
        public final double alpha;
        public final EWMA ewmaA;
        public final EWMA ewmaB;
        public float mioWeight;
        public final double threshold;
        public float ttnetWeight;
        public boolean weightChanged;

        public NQECombinerEWMA() {
            this(0.3d, 0.5d);
        }

        public NQECombinerEWMA(double d, double d2) {
            this.alpha = d;
            this.threshold = d2;
            this.ewmaA = new EWMA(d);
            this.ewmaB = new EWMA(d);
            this.ttnetWeight = 0.5f;
            this.mioWeight = 0.5f;
        }

        public final double combine(int i, int i2, float f, float f2) {
            if (i <= 0) {
                return i2;
            }
            if (i2 <= 0) {
                return i;
            }
            double d = i;
            double d2 = i2;
            double dUpdate = d - this.ewmaA.update(d);
            double dUpdate2 = d2 - this.ewmaB.update(d2);
            if (dUpdate <= (-this.threshold) && Math.abs(dUpdate) > Math.abs(dUpdate2)) {
                this.ttnetWeight = 0.8f;
                this.mioWeight = 0.2f;
                this.weightChanged = true;
            } else if (dUpdate2 >= this.threshold && dUpdate2 > Math.abs(dUpdate)) {
                this.ttnetWeight = 0.2f;
                this.mioWeight = 0.8f;
                this.weightChanged = true;
            } else if (!this.weightChanged) {
                this.ttnetWeight = f;
                this.mioWeight = f2;
            }
            return (((double) this.ttnetWeight) * d) + (((double) this.mioWeight) * d2);
        }
    }

    public static final class EWMA {
        public final double alpha;
        public Double ewma;

        public final Double getValue() {
            return this.ewma;
        }

        public EWMA(double d) {
            this.alpha = d;
        }

        public final double update(double d) {
            double d2 = this.alpha;
            double d3 = d2 * d;
            double d4 = ((double) 1) - d2;
            Double d5 = this.ewma;
            if (d5 != null) {
                d = d5.doubleValue();
            }
            double d6 = d3 + (d4 * d);
            this.ewma = Double.valueOf(d6);
            return d6;
        }
    }

    private final void updateNetworkLevel(int i) {
        if (((Boolean) C310360CEo.LIZJ.getValue()).booleanValue()) {
            NetworkStateNqeService.INSTANCE.notifyNQEChange(NetworkLevelKt.obtainNetworkLevelByCombineNqe(i));
        }
    }

    public final Page getPageByName(String str) {
        if (vodPlayPageList.contains(C13LP.LJJLIIIJJI(a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)))) {
            return Page.VOD;
        }
        if (livePlayPageList.contains(C13LP.LJJLIIIJJI(a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)))) {
            return Page.LIVE;
        }
        return Page.DEFAULT;
    }

    public final void onLiveNqeChanged(int i) {
        lastLiveNqe = i;
        lastCombineNqe = updateCombineNqe();
    }

    public final void onTTNetNqeChanged(int i) {
        lastTTNetNqe = convertTTNetNqe(i);
        lastCombineNqe = updateCombineNqe();
    }

    public final void onVodNqeChanged(int i) {
        lastVodNqe = i;
        lastCombineNqe = updateCombineNqe();
    }

    private final int combineNqe(int i, int i2) {
        if (i == -1) {
            return -1;
        }
        if (i != 0) {
            if (i2 == 0) {
                return i;
            }
            return C814420VxA.LIZ(nqeCombiner.combine(i, i2, defaultWeightTTNetNqe, defaultWeightMIONqe));
        }
        return i2;
    }
}
