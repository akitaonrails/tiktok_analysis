package com.bytedance.android.livesdk.impl.revenue.level;

import X.C1094360eaI;
import X.C1094490eaV;
import X.C1094500eaW;
import X.C1094510eaX;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import tikcast.api.user_level.UserGrade;

/* JADX INFO: loaded from: classes18.dex */
public class UserLevelService implements IUserLevelService {
    public IUserLevelService LL;

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final C1094490eaV DX() {
        C1094490eaV c1094490eaVDX;
        IUserLevelService iUserLevelService = this.LL;
        return (iUserLevelService == null || (c1094490eaVDX = iUserLevelService.DX()) == null) ? new C1094490eaV() : c1094490eaVDX;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final C1094360eaI HP() {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            return iUserLevelService.HP();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final String XS1() {
        String strXS1;
        IUserLevelService iUserLevelService = this.LL;
        return (iUserLevelService == null || (strXS1 = iUserLevelService.XS1()) == null) ? "" : strXS1;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final RoomRecycleWidget aq2() {
        return new UserLevelWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final boolean eG2() {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            return iUserLevelService.eG2();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final DataChannel gA0() {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            return iUserLevelService.gA0();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final CopyOnWriteArraySet<Double> lB2() {
        CopyOnWriteArraySet<Double> copyOnWriteArraySetLB2;
        IUserLevelService iUserLevelService = this.LL;
        return (iUserLevelService == null || (copyOnWriteArraySetLB2 = iUserLevelService.lB2()) == null) ? new CopyOnWriteArraySet<>() : copyOnWriteArraySetLB2;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void s01() {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            iUserLevelService.s01();
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int vF1() {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            return iUserLevelService.vF1();
        }
        return 50;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final Class<? extends LiveRecyclableWidget> Dk1() {
        return UserLevelWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final C1094500eaW A21(GiftsInfo.LevelUpGiftInfo levelUpGiftInfo) {
        C1094500eaW c1094500eaWA21;
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService == null || (c1094500eaWA21 = iUserLevelService.A21(levelUpGiftInfo)) == null) {
            return new C1094500eaW();
        }
        return c1094500eaWA21;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int L82(int i) {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            return iUserLevelService.L82(i);
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void QL(double d) {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            iUserLevelService.QL(d);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int TD2(List<BadgeStruct> list) {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            return iUserLevelService.TD2(list);
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final boolean Tj1(int i) {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            return iUserLevelService.Tj1(i);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void WN1(long j) {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            iUserLevelService.WN1(j);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void cG2(double d) {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            iUserLevelService.cG2(d);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final int m40(long j) {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            return iUserLevelService.m40(j);
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void nz0(int i) {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            iUserLevelService.nz0(i);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final ImageModel oy0(int i) {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            return iUserLevelService.oy0(i);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void gN(String str, Boolean bool, String str2) {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            iUserLevelService.gN(str, bool, str2);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.level.IUserLevelService
    public final void HS1(UserGrade userGrade, boolean z, String str, boolean z2, C1094510eaX c1094510eaX) {
        IUserLevelService iUserLevelService = this.LL;
        if (iUserLevelService != null) {
            iUserLevelService.HS1(userGrade, z, str, z2, c1094510eaX);
        }
    }
}
