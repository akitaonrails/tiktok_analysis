package com.ss.android.ugc.aweme.topic.movie;

import X.C04TD;
import X.C0C64;
import X.C0O17;
import X.C0O42;
import X.C0O7A;
import X.C0OFG;
import X.C0OFL;
import X.C1389890mGx;
import X.C13LP;
import X.C19EG;
import X.C613290O3r;
import X.C613300O3s;
import X.InterfaceC346201Wa;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.movie.MovieTokServiceImpl;
import com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi;
import com.ss.android.ugc.aweme.topic.movie.favorite.MovieFavoritePage;
import java.util.List;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class MovieTokServiceImpl implements IMovieTokService<C613300O3s, C0O42, C0O17> {

    public static final class MovieFavoritePageData extends PowerViewPagerFragmentItem<MovieFavoritePage> {
        public static final Parcelable.Creator<MovieFavoritePageData> CREATOR = new Parcelable.Creator<MovieFavoritePageData>() { // from class: X.0OFK
            @Override // android.os.Parcelable.Creator
            public final MovieTokServiceImpl.MovieFavoritePageData createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new MovieTokServiceImpl.MovieFavoritePageData();
            }

            @Override // android.os.Parcelable.Creator
            public final MovieTokServiceImpl.MovieFavoritePageData[] newArray(int i) {
                return new MovieTokServiceImpl.MovieFavoritePageData[i];
            }
        };

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static IMovieTokService LJ() {
        Object objLIZ = C04TD.LIZ(IMovieTokService.class, false);
        if (objLIZ != null) {
            return (IMovieTokService) objLIZ;
        }
        if (C04TD.M5 == null) {
            synchronized (IMovieTokService.class) {
                if (C04TD.M5 == null) {
                    C04TD.M5 = new MovieTokServiceImpl();
                }
            }
        }
        return C04TD.M5;
    }

    @Override // com.ss.android.ugc.aweme.topic.movie.IMovieTokService
    public final InterfaceC346201Wa<C0O7A<C613300O3s>> LIZ(String str) {
        MovieDetailApi.LIZ.getClass();
        return C613290O3r.LIZIZ(str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0OFG] */
    @Override // com.ss.android.ugc.aweme.topic.movie.IMovieTokService
    public final C0OFG LIZIZ(final Context context) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "display_movietok_favorite_tab", true, false)) {
            return new C0OFL(context) { // from class: X.0OFG
                public final FavoriteTabItemV2 LLILLJJLI;

                @Override // X.C0OFL
                public final FavoriteTabItemV2 LIZ() {
                    return this.LLILLJJLI;
                }

                {
                    this.LLILLJJLI = new FavoriteTabItemV2(new MovieTokServiceImpl.MovieFavoritePageData(), a0.LJJJLL(CardStruct.IStatusCode.DEFAULT, context.getString(2131837505, 0)), "movies", "movies");
                }

                @C14EU(threadMode = ThreadMode.MAIN)
                public final void onCollectEvent(C613490O4l c613490O4l) {
                    TopicRawInfo topicRawInfo = c613490O4l.LIZ;
                    if (topicRawInfo != null) {
                        Integer num = topicRawInfo.type;
                        int type = C0O4X.MOVIE.getType();
                        if (num != null && num.intValue() == type) {
                            if (c613490O4l.LIZIZ) {
                                C0OFL.LIZLLL(this.LL, 1);
                            } else {
                                C0OFL.LIZIZ(this.LL);
                            }
                        }
                    }
                }

                @C14EU(threadMode = ThreadMode.MAIN)
                public final void onMovieTotalEvent(C7855034z c7855034z) {
                    this.LL.setValue(Integer.valueOf(c7855034z.LIZ));
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.topic.movie.IMovieTokService
    public final InterfaceC346201Wa<C0O7A<C613300O3s>> LIZLLL(String str) {
        MovieDetailApi.LIZ.getClass();
        return C613290O3r.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.topic.movie.IMovieTokService
    public final boolean LIZJ(int i, C19EG c19eg, List list) {
        if (list.size() >= 5) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(c19eg.getResources().getString(2131837501, 5));
            c1389890mGx.LJIIJJI();
            return false;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//topic/movie/search");
        smartRouteBuildRoute.withParam("selected_movie_max_count", Math.min((10 - i) + list.size(), 5));
        smartRouteBuildRoute.withParam("selected_movie_ids", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        smartRouteBuildRoute.open();
        return true;
    }
}
