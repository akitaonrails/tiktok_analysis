package com.ss.android.ugc.aweme.ecommerce.base.address.cache.data;

import X.AnonymousClass0317;
import X.C034S;
import X.C09CT;
import X.C1120604Zw;
import X.C1AQS;
import X.C962403pW;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressListCacheConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressCacheModel {
    public String LIZ;
    public String LIZIZ;

    @C09CT("address_list_cache_data")
    public final String addressListData;

    @C09CT("address_list_cache_type")
    public final int cacheType;

    @C09CT("region")
    public final String region;

    @C09CT("cache_time_stamp")
    public final long timeStamp;

    @C09CT("user_id")
    public final String uid;

    public AddressCacheModel() {
        this(0L, "", 1, "", "");
    }

    public final boolean LIZ() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        String str = this.uid;
        if (str == null || str.length() == 0) {
            this.LIZ = "no_cache";
            return false;
        }
        String str2 = this.uid;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        if (!Intrinsics.LJFF(str2, ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId())) {
            this.LIZ = "account_change";
            return false;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, ILocationDependencyService.class.getName(), anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        String currentRegionCode = ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode();
        String str3 = this.region;
        if (str3 == null || str3.length() == 0 || !Intrinsics.LJFF(this.region, currentRegionCode)) {
            this.LIZ = "region_change";
            return false;
        }
        float f = 60;
        if (System.currentTimeMillis() - this.timeStamp < ((long) (((AddressListCacheConfig) C962403pW.LIZIZ.getValue()).addressListCacheTimeoutHour * f * f * LSPassThroughRecordSizeConfig.DEFAULT))) {
            return true;
        }
        this.LIZ = "time_out";
        return false;
    }

    public AddressCacheModel(long j, String str, int i, String str2, String str3) {
        this.timeStamp = j;
        this.addressListData = str;
        this.cacheType = i;
        this.region = str2;
        this.uid = str3;
        this.LIZ = "";
        this.LIZIZ = "";
    }
}
