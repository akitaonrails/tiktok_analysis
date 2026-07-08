package com.ss.android.ugc.aweme.discover.model;

import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DiscoverSectionItem {

    public static final class BannerSection extends DiscoverSectionItem {
        public final List<Banner> bannerList;

        public final BannerSection copy(List<? extends Banner> list) {
            return new BannerSection(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BannerSection) && Intrinsics.LJFF(this.bannerList, ((BannerSection) obj).bannerList);
        }

        public int hashCode() {
            return this.bannerList.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BannerSection(bannerList=");
            sbLIZ.append(this.bannerList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final List<Banner> getBannerList() {
            return this.bannerList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BannerSection(List<? extends Banner> list) {
            this.bannerList = list;
        }
    }

    public static final class TrendingTopicOrAdSection extends DiscoverSectionItem {
        public final TrendingTopicOrAd trendingTopicOrAd;

        public final TrendingTopicOrAdSection copy(TrendingTopicOrAd trendingTopicOrAd) {
            return new TrendingTopicOrAdSection(trendingTopicOrAd);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrendingTopicOrAdSection) && Intrinsics.LJFF(this.trendingTopicOrAd, ((TrendingTopicOrAdSection) obj).trendingTopicOrAd);
        }

        public int hashCode() {
            return this.trendingTopicOrAd.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TrendingTopicOrAdSection(trendingTopicOrAd=");
            sbLIZ.append(this.trendingTopicOrAd);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final TrendingTopicOrAd getTrendingTopicOrAd() {
            return this.trendingTopicOrAd;
        }

        public TrendingTopicOrAdSection(TrendingTopicOrAd trendingTopicOrAd) {
            this.trendingTopicOrAd = trendingTopicOrAd;
        }
    }
}
