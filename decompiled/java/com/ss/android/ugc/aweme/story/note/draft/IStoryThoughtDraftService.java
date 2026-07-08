package com.ss.android.ugc.aweme.story.note.draft;

import X.C1404940mfE;
import X.C817600W5m;
import X.InterfaceC1364105Vn;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResult;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public interface IStoryThoughtDraftService {
    Object LIZ(String str, InterfaceC1364105Vn<? super C817600W5m> interfaceC1364105Vn);

    Object LIZIZ(Context context, C817600W5m c817600W5m, AvatarThoughtResult avatarThoughtResult, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object LIZJ(List<C817600W5m> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LIZLLL(String str, String str2);

    Object LJ(C817600W5m c817600W5m, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    LiveData<List<C817600W5m>> LJFF();

    String LJI(String str);

    LiveData<List<C817600W5m>> LJII();

    Object LJIIIIZZ(Context context, String str, StoryNoteInfoModel storyNoteInfoModel, C1404940mfE c1404940mfE, AvatarThoughtResult avatarThoughtResult, InterfaceC1364105Vn<? super C817600W5m> interfaceC1364105Vn);

    Object LJIIIZ(C817600W5m c817600W5m, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);
}
