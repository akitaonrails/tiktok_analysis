package com.ss.android.ugc.aweme.story.celebration;

import X.C0CCZ;
import X.InterfaceC1597960rgY;
import X.InterfaceC1599360rio;
import X.InterfaceC567940MPg;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface IStoryCelebrationService {
    void clearKevaForDebug();

    List<ForwardMedia> convertAwemeToForwardMedia(List<? extends Aweme> list, int i, String str);

    void exitInboxStoryCelebrationEntrance(VideoPublishEditModel videoPublishEditModel);

    InterfaceC567940MPg getCelebrationConfigHandler();

    String getCelebrationEntranceUniqueId(TemplateData templateData);

    C0CCZ getPreloadLegoTask();

    InterfaceC1599360rio getStoryCelebrationCellInterception();

    InterfaceC1597960rgY getStoryCelebrationPublishHandler();

    Map<String, Object> getStoryCelebrationRequestParam();

    boolean isCelebrationExited(int i);

    boolean shouldShowCreationEntrance(SkylightData skylightData);
}
