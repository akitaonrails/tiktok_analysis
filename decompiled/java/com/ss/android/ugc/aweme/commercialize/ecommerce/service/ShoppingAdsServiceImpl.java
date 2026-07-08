package com.ss.android.ugc.aweme.commercialize.ecommerce.service;

import X.C0PEM;
import X.C1022820ciu;
import X.C1029350ctR;
import X.C1030490cvH;
import X.C1051660dTQ;
import X.C13LP;
import X.C19EG;
import X.C1AF0;
import X.C2097608Jq;
import X.C2184171Adz;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1393680mN4;
import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.jsb.GetSharedMemoryItemMethod;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.jsb.OpenHybridMethod;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.jsb.SetSharedMemoryItemMethod;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.ui.WishListFragment;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.IComponentStatus;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class ShoppingAdsServiceImpl implements IShoppingAdsService {
    public volatile boolean LIZ;

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final Map<String, Class<?>> LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("setSharedMemoryItem", SetSharedMemoryItemMethod.class), new Pair("getSharedMemoryItem", GetSharedMemoryItemMethod.class), new Pair("openHybrid", OpenHybridMethod.class));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final boolean LIZIZ() {
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_wishlist_product_tab", false);
            return zLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return zLIZ;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cvH] */
    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final C1030490cvH LJI() {
        return new InterfaceC1393680mN4() { // from class: X.0cvH
            @Override // X.InterfaceC1393680mN4
            public final AbstractC707180Roa LIZIZ(InterfaceC1392640mLO interfaceC1392640mLO) {
                C1028000crG c1028000crG = new C1028000crG(interfaceC1392640mLO.LIZIZ());
                ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(c1028000crG, EnumC700430Rdh.POSITIVE);
                return c1028000crG;
            }

            @Override // X.InterfaceC1393680mN4
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                if (anchorCommonStruct.getType() == EnumC1430380nKG.AD_PHOTO_CAROUSEL_ANCHOR.getTYPE()) {
                    return true;
                }
                return false;
            }
        };
    }

    public static final class WishListFragmentData extends PowerViewPagerFragmentItem<WishListFragment> {
        public static final Parcelable.Creator<WishListFragmentData> CREATOR = new Parcelable.Creator<WishListFragmentData>() { // from class: X.0cvN
            @Override // android.os.Parcelable.Creator
            public final ShoppingAdsServiceImpl.WishListFragmentData createFromParcel(Parcel parcel) {
                return new ShoppingAdsServiceImpl.WishListFragmentData(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ShoppingAdsServiceImpl.WishListFragmentData[] newArray(int i) {
                return new ShoppingAdsServiceImpl.WishListFragmentData[i];
            }
        };
        public final String location;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.location);
        }

        public WishListFragmentData(String str) {
            this.location = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final void LIZLLL(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct anchorCommonStruct;
        if (!this.LIZ && AwemeExtKt.isAdTraffic(aweme) && (anchors = aweme.getAnchors()) != null && (anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLZIJ(0, anchors)) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1029350ctR(anchorCommonStruct, this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final WishListFragmentData LJ(String str) {
        return new WishListFragmentData(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final boolean LJFF(Context context) {
        Fragment fragmentLJJJJZI;
        PdpBulletBottomSheetFragment.LLJJIII.getClass();
        if (context != null && (context instanceof Activity) && (context instanceof C19EG)) {
            C19EG c19eg = (C19EG) context;
            if (!c19eg.isFinishing() && (fragmentLJJJJZI = c19eg.getSupportFragmentManager().LJJJJZI("BulletBottomSheetFragment")) != null && (fragmentLJJJJZI instanceof DialogFragment)) {
                DialogFragment dialogFragment = (DialogFragment) fragmentLJJJJZI;
                if (dialogFragment.isVisible()) {
                    dialogFragment.dismiss();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final BaseBridgeMethod LIZJ(C1051660dTQ c1051660dTQ, String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 37819622) {
            if (iHashCode != 208424571) {
                if (iHashCode == 1752152431 && str.equals("getSharedMemoryItem")) {
                    return new GetSharedMemoryItemMethod(c1051660dTQ);
                }
                return null;
            }
            if (str.equals("setSharedMemoryItem")) {
                return new SetSharedMemoryItemMethod(c1051660dTQ);
            }
            return null;
        }
        if (str.equals("openHybrid")) {
            return new OpenHybridMethod(c1051660dTQ);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService
    public final void reportProfilePlpClickEvent(Map<String, ? extends Object> map, AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && map.containsKey("clickFromProfile")) {
            Object obj = map.get("clickFromProfile");
            if (!(obj instanceof Boolean)) {
                obj = null;
            }
            if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "click", awemeRawAd);
                c1022820ciuLIZLLL.LIZJ("halfscreen_page", "refer");
                c1022820ciuLIZLLL.LJII();
            }
        }
    }
}
