package com.ss.android.ugc.aweme.series.favorite.serviceimpl;

import X.C01GW;
import X.C04TD;
import X.C0OFL;
import X.C11L6;
import X.C1206620hVM;
import X.C1573560r3C;
import X.C452501pT;
import X.EnumC1578460rB6;
import X.InterfaceC1612120s3O;
import Y.AfS3S0110100_24;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.series.favorite.fragments.SeriesFavoriteFragment;
import com.ss.android.ugc.aweme.series.favorite.serviceimpl.SeriesFavoriteServiceImpl;
import com.ss.android.ugc.aweme.service.ISeriesFavoriteService;
import com.ss.android.ugc.aweme.service.ISeriesProfileService;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesFavoriteServiceImpl implements ISeriesFavoriteService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(268));

    /* JADX INFO: loaded from: classes19.dex */
    public static final class SeriesFavoritePageData extends PowerViewPagerFragmentItem<SeriesFavoriteFragment> {
        public static final Parcelable.Creator<SeriesFavoritePageData> CREATOR = new Parcelable.Creator<SeriesFavoritePageData>() { // from class: X.0hVN
            @Override // android.os.Parcelable.Creator
            public final SeriesFavoriteServiceImpl.SeriesFavoritePageData createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new SeriesFavoriteServiceImpl.SeriesFavoritePageData();
            }

            @Override // android.os.Parcelable.Creator
            public final SeriesFavoriteServiceImpl.SeriesFavoritePageData[] newArray(int i) {
                return new SeriesFavoriteServiceImpl.SeriesFavoritePageData[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static ISeriesFavoriteService LIZJ() {
        Object objLIZ = C04TD.LIZ(ISeriesFavoriteService.class, false);
        if (objLIZ != null) {
            return (ISeriesFavoriteService) objLIZ;
        }
        if (C04TD.T3 == null) {
            synchronized (ISeriesFavoriteService.class) {
                if (C04TD.T3 == null) {
                    C04TD.T3 = new SeriesFavoriteServiceImpl();
                }
            }
        }
        return C04TD.T3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0hVM] */
    @Override // com.ss.android.ugc.aweme.service.ISeriesFavoriteService
    public final C1206620hVM LIZIZ(final Context context) {
        return new C0OFL(context) { // from class: X.0hVM
            public final FavoriteTabItemV2 LLILLJJLI;

            @Override // X.C0OFL
            public final FavoriteTabItemV2 LIZ() {
                return this.LLILLJJLI;
            }

            {
                ISeriesProfileService iSeriesProfileService = (ISeriesProfileService) PluggableExtentionKt.pluggableSpi$default(ISeriesProfileService.class, false, false, false, 14, null);
                if (iSeriesProfileService != null) {
                    iSeriesProfileService.LIZ();
                }
                this.LLILLJJLI = new FavoriteTabItemV2(new SeriesFavoriteServiceImpl.SeriesFavoritePageData(), a0.LJJJLL(CardStruct.IStatusCode.DEFAULT, context.getString(2131847514, 0)), "series", "series");
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onCollectSeriesEvent(AnonymousClass0357 anonymousClass0357) {
                if (anonymousClass0357.LIZ) {
                    C0OFL.LIZLLL(this.LL, 1);
                } else {
                    C0OFL.LIZIZ(this.LL);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesFavoriteService
    public final C11L6 LIZ(long j, boolean z, boolean z2) {
        InterfaceC1612120s3O.LIZ.getClass();
        InterfaceC1612120s3O interfaceC1612120s3O = (InterfaceC1612120s3O) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(InterfaceC1612120s3O.class);
        IDramaSharedApiPathService.LIZ.getClass();
        return interfaceC1612120s3O.LIZ(C1573560r3C.LIZ().LIZ(EnumC1578460rB6.ADD_TO_FAVORITE), j, z ? 1 : 0, z2).LJIILL(new AfS3S0110100_24(this, j, z, 0));
    }
}
