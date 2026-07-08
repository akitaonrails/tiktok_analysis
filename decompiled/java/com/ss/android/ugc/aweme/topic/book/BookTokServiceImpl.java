package com.ss.android.ugc.aweme.topic.book;

import X.C0C64;
import X.C0O1A;
import X.C0O4C;
import X.C0O7A;
import X.C0OFH;
import X.C0OFL;
import X.C1389890mGx;
import X.C13LP;
import X.C19EG;
import X.C613220O3k;
import X.C613230O3l;
import X.C613240O3m;
import X.InterfaceC346201Wa;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.favorites.business.monitor.TopicApiNetworkPartner;
import com.ss.android.ugc.aweme.topic.book.BookTokServiceImpl;
import com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailApi;
import com.ss.android.ugc.aweme.topic.book.favorite.BookCollectionListPage;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class BookTokServiceImpl implements IBookTokService<C613230O3l, C613240O3m, C0O4C, C0O1A> {

    public static final class BookCollectionListPageFragmentData extends PowerViewPagerFragmentItem<BookCollectionListPage> {
        public static final Parcelable.Creator<BookCollectionListPageFragmentData> CREATOR = new Parcelable.Creator<BookCollectionListPageFragmentData>() { // from class: X.0OFI
            @Override // android.os.Parcelable.Creator
            public final BookTokServiceImpl.BookCollectionListPageFragmentData createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new BookTokServiceImpl.BookCollectionListPageFragmentData();
            }

            @Override // android.os.Parcelable.Creator
            public final BookTokServiceImpl.BookCollectionListPageFragmentData[] newArray(int i) {
                return new BookTokServiceImpl.BookCollectionListPageFragmentData[i];
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

    @Override // com.ss.android.ugc.aweme.topic.book.IBookTokService
    public final TopicApiNetworkPartner LIZ() {
        return new TopicApiNetworkPartner();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0OFH] */
    @Override // com.ss.android.ugc.aweme.topic.book.IBookTokService
    public final C0OFH LIZJ(final Context context) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "display_booktok_favorate_tab", true, false)) {
            return new C0OFL(context) { // from class: X.0OFH
                public final FavoriteTabItemV2 LLILLJJLI;

                @Override // X.C0OFL
                public final FavoriteTabItemV2 LIZ() {
                    return this.LLILLJJLI;
                }

                {
                    this.LLILLJJLI = new FavoriteTabItemV2(new BookTokServiceImpl.BookCollectionListPageFragmentData(), context.getString(2131827853), "books", "books");
                }

                @C14EU(threadMode = ThreadMode.MAIN)
                public final void onCollectBookEvent(C613490O4l c613490O4l) {
                    TopicRawInfo topicRawInfo = c613490O4l.LIZ;
                    if (topicRawInfo != null) {
                        Integer num = topicRawInfo.type;
                        int type = C0O4X.BOOK.getType();
                        if (num != null && num.intValue() == type && c613490O4l.LIZIZ) {
                            C0OFL.LIZLLL(this.LL, 1);
                            return;
                        }
                    }
                    C0OFL.LIZIZ(this.LL);
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.topic.book.IBookTokService
    public final InterfaceC346201Wa<C0O7A<C613240O3m>> LIZLLL(String str) {
        BookDetailApi.LIZ.getClass();
        return C613220O3k.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.topic.book.IBookTokService
    public final InterfaceC346201Wa<C0O7A<C613230O3l>> LJ(String str) {
        BookDetailApi.LIZ.getClass();
        return C613220O3k.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.topic.book.IBookTokService
    public final boolean LIZIZ(int i, C19EG c19eg, List list) {
        if (list.size() >= 5) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(c19eg.getResources().getQuantityString(2131755115, 5, 5));
            c1389890mGx.LJIIJJI();
            return false;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//topic/book/search");
        smartRouteBuildRoute.withParam("selected_book_max_count", Math.min((10 - i) + list.size(), 5));
        smartRouteBuildRoute.withParam("selected_book_ids", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        smartRouteBuildRoute.open();
        return true;
    }
}
