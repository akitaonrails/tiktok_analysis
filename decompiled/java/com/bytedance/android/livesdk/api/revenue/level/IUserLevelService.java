package com.bytedance.android.livesdk.api.revenue.level;

import X.C006A;
import X.C1094360eaI;
import X.C1094490eaV;
import X.C1094500eaW;
import X.C1094510eaX;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import tikcast.api.user_level.UserGrade;

/* JADX INFO: loaded from: classes18.dex */
public interface IUserLevelService extends C006A {
    C1094500eaW A21(GiftsInfo.LevelUpGiftInfo levelUpGiftInfo);

    C1094490eaV DX();

    Class<? extends LiveRecyclableWidget> Dk1();

    C1094360eaI HP();

    void HS1(UserGrade userGrade, boolean z, String str, boolean z2, C1094510eaX c1094510eaX);

    int L82(int i);

    void QL(double d);

    int TD2(List<BadgeStruct> list);

    boolean Tj1(int i);

    void WN1(long j);

    String XS1();

    RoomRecycleWidget aq2();

    void cG2(double d);

    boolean eG2();

    DataChannel gA0();

    void gN(String str, Boolean bool, String str2);

    CopyOnWriteArraySet<Double> lB2();

    int m40(long j);

    void nz0(int i);

    ImageModel oy0(int i);

    void s01();

    int vF1();
}
