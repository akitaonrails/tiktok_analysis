package com.ss.android.ugc.aweme.services.story.forward;

import X.C0ML2;
import X.C0MMK;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public interface ICreativeForwardService {
    void forwardOnThisDay(Context context, ForwardMedia forwardMedia, C0MMK c0mmk, Function0<Unit> function0);

    void forwardOnThisDay(Context context, String str, C0MMK c0mmk, int i, String str2, String str3, String str4, String str5, String str6);

    void forwardOnThisDay(Context context, List<ForwardMedia> list, C0MMK c0mmk, int i, String str, String str2, boolean z, String str3, String str4, Function0<Unit> function0);

    Object generateCommentNoticePreviewCover(Context context, Comment comment, ForwardMedia forwardMedia, boolean z, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn);

    int getAlbumSkylightMinDisplayIntervalDays();

    List<MediaModel> getOnThisDayLocalMedias(boolean z, String str);

    boolean isOnThisDayPublishedToday();

    void loadThumbnail(ImageView imageView, MediaModel mediaModel, Size size, Function1<? super Bitmap, Unit> function1);

    boolean needJumpToOnThisDayPreviewPage();

    boolean onThisDayCanScanAlbum();

    boolean onThisDaySupportLowActivity();

    boolean onThisDaySupportNonLowActivity();

    boolean onThisDaySupportRecallLocalMedias();

    boolean onThisDaySupportRecallMultiPost();

    boolean onThisDaySupportRecallMultiStory();

    void preDownloadOnThisDayFontList();

    boolean shouldAddOnThisDayLocalMediaEntry();

    C0ML2 startForward(Context context, ForwardMedia forwardMedia, C0MMK c0mmk, Function1<? super C0ML2, Unit> function1);

    /* JADX INFO: loaded from: classes22.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void loadThumbnail$default(ICreativeForwardService iCreativeForwardService, ImageView imageView, MediaModel mediaModel, Size size, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    function1 = null;
                }
                iCreativeForwardService.loadThumbnail(imageView, mediaModel, size, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadThumbnail");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C0ML2 startForward$default(ICreativeForwardService iCreativeForwardService, Context context, ForwardMedia forwardMedia, C0MMK c0mmk, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    function1 = null;
                }
                return iCreativeForwardService.startForward(context, forwardMedia, c0mmk, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startForward");
        }
    }
}
