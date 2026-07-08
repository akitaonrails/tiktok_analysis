package com.ss.android.ugc.aweme.search.ecommerce.entrance;

import X.C09CT;
import X.C0QPT;
import X.C0QSX;
import X.EnumC671220QUm;
import X.EnumC672280QYo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ECSearchEntranceData implements Serializable {
    public static final C0QSX Companion = new Object() { // from class: X.0QSX
    };

    @C09CT("root_enter_from_type")
    public final int rootEnterFromType;

    @C09CT("route_uri")
    public final String routeUri;

    public abstract Boolean getBooleanOrNullStrategy(String str);

    public abstract boolean getBooleanStrategy(String str);

    public abstract EnumC671220QUm getDisableSugStrategy();

    public abstract Float getFloatOrNullStrategy(String str);

    public abstract float getFloatStrategy(String str);

    public abstract C0QPT getHistoryIsolateStrategy();

    public abstract Integer getIntOrNullStrategy(String str);

    public abstract int getIntStrategy(String str);

    public abstract EnumC672280QYo getMiddleGuessCacheStrategy();

    public abstract ECSearchResultBgColor getResultBgColor();

    public abstract String[] getStringArrayOrNullStrategy(String str);

    public abstract String getStringOrNullStrategy(String str);

    public abstract String getStringStrategy(String str);

    public abstract void updateFeatureStrategy(String str, Object obj);

    public abstract void updateFeatureStrategyOnce(String str, String str2);

    public final int getEntranceValue$search_api_release() {
        return this.rootEnterFromType;
    }

    public final int getRootEnterFromType() {
        return this.rootEnterFromType;
    }

    public final String getRouteUri() {
        return this.routeUri;
    }

    public ECSearchEntranceData(int i, String str) {
        this.rootEnterFromType = i;
        this.routeUri = str;
    }
}
