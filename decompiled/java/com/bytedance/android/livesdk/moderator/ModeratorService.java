package com.bytedance.android.livesdk.moderator;

import X.C786410Ut5;
import android.os.Bundle;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModerateDialog;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModeratorListFragment;

/* JADX INFO: loaded from: classes13.dex */
public class ModeratorService implements IModeratorService {
    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorHostIModeratorListFragment Qp0() {
        return new ModeratorHostIModeratorListFragment();
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorHostIModerateDialog SJ2() {
        return new ModeratorHostIModerateDialog();
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorPermissionEditFragment kk2() {
        return new ModeratorPermissionEditFragment();
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorListFragmentSheet lH1() {
        ModeratorListFragmentSheet moderatorListFragmentSheet = new ModeratorListFragmentSheet();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "entrance", "");
        moderatorListFragmentSheet.setArguments(bundle);
        return moderatorListFragmentSheet;
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorPermissionEditFragmentSheet mr1() {
        return new ModeratorPermissionEditFragmentSheet();
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final AddModeratorFragment wN1(String str) {
        AddModeratorFragment addModeratorFragment = new AddModeratorFragment();
        Bundle bundle = new Bundle();
        if (str != null) {
            C786410Ut5.LJJIZ(bundle, "entrance", str);
        }
        addModeratorFragment.setArguments(bundle);
        return addModeratorFragment;
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final NewModeratorListSheet wj2(String str) {
        NewModeratorListSheet newModeratorListSheet = new NewModeratorListSheet();
        Bundle bundle = new Bundle();
        if (str != null) {
            C786410Ut5.LJJIZ(bundle, "entrance", str);
        }
        newModeratorListSheet.setArguments(bundle);
        return newModeratorListSheet;
    }

    @Override // com.bytedance.android.live.moderator.IModeratorService
    public final ModeratorListFragment zb2(String str) {
        ModeratorListFragment moderatorListFragment = new ModeratorListFragment();
        Bundle bundle = new Bundle();
        if (str != null) {
            C786410Ut5.LJJIZ(bundle, "entrance", str);
        }
        moderatorListFragment.setArguments(bundle);
        return moderatorListFragment;
    }
}
