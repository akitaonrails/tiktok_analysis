package com.ss.android.ugc.aweme.live.alphaplayer.player;

import X.C20144413ru;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes35.dex */
public class DefaultSystemPlayer extends AbsPlayer<DefaultSystemPlayer> {
    public String dataSource;
    public MediaPlayer mediaPlayer;
    public MediaMetadataRetriever retriever = new MediaMetadataRetriever();
    public MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() { // from class: X.1CxQ
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            DefaultSystemPlayer defaultSystemPlayer = this.LL;
            IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = defaultSystemPlayer.completionListener;
            if (onCompletionListener != 0) {
                onCompletionListener.onCompletion(defaultSystemPlayer.self);
            }
        }
    };
    public MediaPlayer.OnPreparedListener mPreparedListener = new MediaPlayer.OnPreparedListener() { // from class: X.1CxR
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            DefaultSystemPlayer defaultSystemPlayer = this.LL;
            IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = defaultSystemPlayer.preparedListener;
            if (onPreparedListener != 0) {
                onPreparedListener.onPrepared(defaultSystemPlayer.self);
            }
        }
    };
    public MediaPlayer.OnErrorListener mErrorListener = new MediaPlayer.OnErrorListener() { // from class: X.1CxB
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            DefaultSystemPlayer defaultSystemPlayer = this.LL;
            IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = defaultSystemPlayer.errorListener;
            if (onErrorListener != 0) {
                onErrorListener.onError(defaultSystemPlayer.self, i, i2, "");
                return false;
            }
            return false;
        }
    };
    public MediaPlayer.OnInfoListener mInfoListener = new MediaPlayer.OnInfoListener() { // from class: X.1CxS
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            DefaultSystemPlayer defaultSystemPlayer;
            IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener;
            if (i == 3 && (onFirstFrameListener = (defaultSystemPlayer = this.LL).firstFrameListener) != 0) {
                onFirstFrameListener.onFirstFrame(defaultSystemPlayer.self);
                return false;
            }
            return false;
        }
    };

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public String getPlayerSimpleName() {
        return "DefaultSystemPlayer";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public int getCurrentPosition() {
        return this.mediaPlayer.getCurrentPosition();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public VideoInfo getVideoInfo() throws Exception {
        if (TextUtils.isEmpty(this.dataSource)) {
            throw new Exception("dataSource is null, please set setDataSource firstly");
        }
        this.retriever.setDataSource(this.dataSource);
        String strLJII = C20144413ru.LJII(this.retriever);
        String strLJFF = C20144413ru.LJFF(this.retriever);
        if (TextUtils.isEmpty(strLJII) || TextUtils.isEmpty(strLJFF)) {
            throw new Exception("retriever get metadata failure");
        }
        return new VideoInfo(CastIntegerProtector.parseInt(strLJII), CastIntegerProtector.parseInt(strLJFF), this.mediaPlayer.getDuration());
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void initMediaPlayer() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mediaPlayer = mediaPlayer;
        mediaPlayer.setOnCompletionListener(this.mCompletionListener);
        this.mediaPlayer.setOnPreparedListener(this.mPreparedListener);
        this.mediaPlayer.setOnErrorListener(this.mErrorListener);
        this.mediaPlayer.setOnInfoListener(this.mInfoListener);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public boolean isPlaying() {
        return this.mediaPlayer.isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void pause() {
        this.mediaPlayer.pause();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void prepareAsync() {
        this.mediaPlayer.prepareAsync();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void release() {
        this.mediaPlayer.release();
        this.dataSource = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void reset() {
        this.mediaPlayer.reset();
        this.dataSource = null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void start() {
        this.mediaPlayer.start();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void stop() {
        this.mediaPlayer.stop();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void seekTo(int i) {
        this.mediaPlayer.seekTo(i, 3);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setDataSource(String str) throws IOException {
        this.dataSource = str;
        this.mediaPlayer.setDataSource(str);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setLooping(boolean z) {
        this.mediaPlayer.setLooping(z);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
        this.mediaPlayer.setScreenOnWhilePlaying(z);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public void setSurface(Surface surface) {
        this.mediaPlayer.setSurface(surface);
    }
}
