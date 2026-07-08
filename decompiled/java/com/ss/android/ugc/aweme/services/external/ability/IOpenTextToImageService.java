package com.ss.android.ugc.aweme.services.external.ability;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.IRecordEnv;
import com.ss.android.ugc.aweme.services.external.IShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public interface IOpenTextToImageService {
    void openTextToImage(Activity activity, String str, Aweme aweme, String str2);

    void openTextToImage(Activity activity, String str, String str2, TextToImageRouteParams textToImageRouteParams);

    void openTextToImageFromRecord(IRecordEnv iRecordEnv, int i, Bundle bundle, Function1<? super Boolean, Unit> function1);

    void openTextToImageWithShortVideoContext(Activity activity, IShortVideoContext iShortVideoContext, int i, Bundle bundle, Function1<? super Boolean, Unit> function1);

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openTextToImageFromRecord$default(IOpenTextToImageService iOpenTextToImageService, IRecordEnv iRecordEnv, int i, Bundle bundle, Function1 function1, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    function1 = null;
                }
                iOpenTextToImageService.openTextToImageFromRecord(iRecordEnv, i, bundle, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openTextToImageFromRecord");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openTextToImageWithShortVideoContext$default(IOpenTextToImageService iOpenTextToImageService, Activity activity, IShortVideoContext iShortVideoContext, int i, Bundle bundle, Function1 function1, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 16) != 0) {
                    function1 = null;
                }
                iOpenTextToImageService.openTextToImageWithShortVideoContext(activity, iShortVideoContext, i, bundle, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openTextToImageWithShortVideoContext");
        }
    }
}
