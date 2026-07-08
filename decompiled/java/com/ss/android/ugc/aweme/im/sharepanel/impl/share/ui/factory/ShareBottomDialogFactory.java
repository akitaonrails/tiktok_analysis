package com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.factory;

import X.DialogC1366380lf2;
import android.app.Activity;
import com.ss.android.ugc.aweme.im.sharepanel.api.service.IShareBottomDialogFactory;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareBottomDialogFactory implements IShareBottomDialogFactory {
    public static final ShareBottomDialogFactory LIZ = new ShareBottomDialogFactory();

    public static final class Service implements IShareBottomDialogFactory {
        public final /* synthetic */ ShareBottomDialogFactory LIZ = ShareBottomDialogFactory.LIZ;

        @Override // com.ss.android.ugc.aweme.im.sharepanel.api.service.IShareBottomDialogFactory
        public final DialogC1366380lf2 LIZ(Activity activity, SharePackage sharePackage) {
            return this.LIZ.LIZ(activity, sharePackage);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.service.IShareBottomDialogFactory
    public final DialogC1366380lf2 LIZ(Activity activity, SharePackage sharePackage) {
        return new DialogC1366380lf2(activity, null, null, sharePackage, null, null, null, null, true, true, false, false, null);
    }
}
