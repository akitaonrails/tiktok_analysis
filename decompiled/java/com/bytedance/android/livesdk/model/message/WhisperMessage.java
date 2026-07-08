package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WhisperMessage extends AbstractC1136060ffY {

    @C09CT("at_user")
    public User atUser;

    @C09CT("background_image")
    public ImageModel backgroundImage;

    @C09CT("content")
    public Text content;

    /* JADX INFO: renamed from: emotes, reason: collision with root package name */
    @C09CT("emotes")
    public List<EmoteWithIndex> f316emotes;

    @C09CT("encoding_type")
    public int encodingType;

    @C09CT("user")
    public User user;

    public static final class EmoteWithIndex {

        @C09CT("emote")
        public EmoteModel emote;

        @C09CT("index")
        public long index;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public WhisperMessage() {
        this.type = C001A.WHISPER_MESSAGE;
        this.f316emotes = new ArrayList();
    }
}
