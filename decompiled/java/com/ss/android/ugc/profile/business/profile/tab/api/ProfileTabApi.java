package com.ss.android.ugc.profile.business.profile.tab.api;

import X.AbstractC468201s0;
import X.C01GW;
import X.C080U;
import X.C0SC4;
import X.C0W93;
import X.C1253130iiN;
import X.C1256020in2;
import X.C1256080in8;
import X.C1331660kl2;
import X.C1515820pY4;
import X.C15O7;
import X.C1601690rmZ;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2550909z9;
import X.C299890BpD;
import X.C422830Gi1;
import X.C438710HIf;
import X.C452501pT;
import X.C818480W8w;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174608fY;
import X.InterfaceC2174808fa;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileTabApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(373));

    public interface TabApi {
        @InterfaceC2174608fY
        @InterfaceC1501160pAQ("/aweme/v1/aweme/post/")
        C15O7<C1515820pY4<FeedItemList>> getPublicPostApi(@InterfaceC1501120pAM("user_avatar_shrink") String str, @InterfaceC1501120pAM("video_cover_shrink") String str2, @InterfaceC1501120pAM("screen_reader_enable") Boolean bool, @InterfaceC1501120pAM("creator_assistant_banner_enable") Integer num, @InterfaceC1501120pAM("sov_client_enable") Integer num2, @InterfaceC1501120pAM("min_cursor") Long l, @InterfaceC1501120pAM("max_cursor") Long l2, @InterfaceC1501120pAM("user_id") String str3, @InterfaceC1501120pAM("sec_user_id") String str4, @InterfaceC1501120pAM("count") Integer num3, @InterfaceC1501120pAM("source") Integer num4, @InterfaceC1501120pAM("locate_item_id") String str5, @InterfaceC1501120pAM("sort_type") Integer num5, @InterfaceC1501120pAM("enter_from") String str6, @InterfaceC1501120pAM("ad_item_id") String str7, @InterfaceC1501120pAM("filter_private") Integer num6, @InterfaceC1501120pAM("is_chunk") Integer num7, @InterfaceC2174808fa List<C080U> list);
    }

    public static final C15O7<C1515820pY4<FeedItemList>> LIZIZ(C1256080in8 c1256080in8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("check_preload", "true"));
        TabApi tabApi = (TabApi) LIZ.getValue();
        if (tabApi != null) {
            String str = c1256080in8.userAvatarShrink;
            String str2 = c1256080in8.videoCoverShrink;
            Boolean bool = c1256080in8.screenReaderEnable;
            Integer num = c1256080in8.createAssistantBannerEnable;
            Integer num2 = c1256080in8.sovClientEnable;
            Long l = c1256080in8.minCursor;
            Long l2 = c1256080in8.maxCursor;
            String str3 = c1256080in8.userId;
            String str4 = c1256080in8.secUserId;
            Integer numValueOf = Integer.valueOf(c1256080in8.count);
            Integer num3 = c1256080in8.source;
            return tabApi.getPublicPostApi(str, str2, bool, num, num2, l, l2, str3, str4, numValueOf, num3, c1256080in8.locateItemId, num3, c1256080in8.enterFrom, c1256080in8.adItemId, c1256080in8.filterPrivate, Integer.valueOf(c1256080in8.isChunk()), arrayList);
        }
        return null;
    }

    public static final void LIZJ(FeedItemList feedItemList, final boolean z) {
        List<Aweme> awemeList;
        UrlModel cover;
        Video video;
        if (!z) {
            C818480W8w.LIZJ(C1253130iiN.LIZ, C0W93.SUCCESS, null, C2097608Jq.LJ());
            C1253130iiN.LIZIZ = false;
        }
        if (feedItemList == null || (awemeList = feedItemList.getAwemeList()) == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final int size = awemeList.size();
        final int i = 0;
        for (Aweme aweme : awemeList) {
            int i2 = i + 1;
            if (i >= 0) {
                Aweme aweme2 = aweme;
                if (aweme2 != null && (video = aweme2.getVideo()) != null) {
                    cover = video.getCover();
                } else {
                    cover = null;
                }
                C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover)).LJJII(new AbstractC468201s0() { // from class: X.0in9
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                        int i3 = i;
                        int i4 = size;
                        long j = jCurrentTimeMillis;
                        boolean z2 = z;
                        c1250680ieQ.getClass();
                        if (i3 == i4 - 1) {
                            C20684815ws.LJFF().execute(new RunnableC351701Yd(i4, System.currentTimeMillis(), j, z2));
                        }
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                        int i3 = i;
                        int i4 = size;
                        long j = jCurrentTimeMillis;
                        boolean z2 = z;
                        c1250680ieQ.getClass();
                        if (i3 == i4 - 1) {
                            C20684815ws.LJFF().execute(new RunnableC351701Yd(i4, System.currentTimeMillis(), j, z2));
                        }
                    }
                });
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static final C1256080in8 LIZ(String str, String str2, String str3, int i, String str4, boolean z, Long l, Long l2, Boolean bool, int i2) {
        boolean z2;
        String strLIZIZ;
        String str5;
        String str6 = str2;
        String str7 = str;
        int[] iArrLIZ = C422830Gi1.LIZ(101);
        int[] iArrLIZ2 = C422830Gi1.LIZ(200);
        if (iArrLIZ != null && iArrLIZ.length != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strLIZIZ2 = "";
        if (!z2) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iArrLIZ[0]);
            sbLIZ.append('_');
            sbLIZ.append(iArrLIZ[1]);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (iArrLIZ2 != null && iArrLIZ2.length != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(iArrLIZ2[0]);
            sbLIZ2.append('_');
            sbLIZ2.append(iArrLIZ2[1]);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        boolean zLIZJ = C1601690rmZ.LIZJ();
        int i3 = C2550909z9.LIZ;
        boolean zLIZ = C0SC4.LIZ();
        Integer num = null;
        if (!TextUtils.isEmpty(str7) || TextUtils.isEmpty(str6)) {
            str6 = null;
        }
        if (TextUtils.isEmpty(str7)) {
            str7 = null;
        }
        if (i == 1 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            str5 = str3;
        } else {
            str5 = null;
        }
        if (C1256020in2.LIZ && z) {
            num = 1;
        }
        return new C1256080in8(strLIZIZ, strLIZIZ2, Boolean.valueOf(zLIZJ), Integer.valueOf(i3), Integer.valueOf(zLIZ ? 1 : 0), l, l2, str6, str7, 9, 0, str3, 0, str4, str5, num, Boolean.valueOf(C299890BpD.LIZ()), bool, i2);
    }
}
