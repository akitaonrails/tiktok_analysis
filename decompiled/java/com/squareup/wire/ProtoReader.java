package com.squareup.wire;

import X.C2188811AlT;
import X.InterfaceC1496620p36;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class ProtoReader {
    public final InterfaceC1496620p36 LIZ;
    public long LIZIZ;
    public int LIZLLL;
    public FieldEncoding LJII;
    public long LIZJ = Long.MAX_VALUE;
    public int LJ = 2;
    public int LJFF = -1;
    public long LJI = -1;

    public final long LIZIZ() throws ProtocolException {
        if (this.LJ != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected LENGTH_DELIMITED but was ");
            sbLIZ.append(this.LJ);
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        long j = this.LIZJ - this.LIZIZ;
        this.LIZ.LLIIII(j);
        this.LJ = 6;
        this.LIZIZ = this.LIZJ;
        this.LIZJ = this.LJI;
        this.LJI = -1L;
        return j;
    }

    public final int LIZJ() throws ProtocolException {
        int i;
        this.LIZ.LLIIII(1L);
        this.LIZIZ++;
        byte b = this.LIZ.readByte();
        if (b >= 0) {
            return b;
        }
        int i2 = b & 127;
        this.LIZ.LLIIII(1L);
        this.LIZIZ++;
        byte b2 = this.LIZ.readByte();
        if (b2 >= 0) {
            i = b2 << 7;
        } else {
            i2 |= (b2 & 127) << 7;
            this.LIZ.LLIIII(1L);
            this.LIZIZ++;
            byte b3 = this.LIZ.readByte();
            if (b3 >= 0) {
                i = b3 << 14;
            } else {
                i2 |= (b3 & 127) << 14;
                this.LIZ.LLIIII(1L);
                this.LIZIZ++;
                byte b4 = this.LIZ.readByte();
                if (b4 < 0) {
                    this.LIZ.LLIIII(1L);
                    this.LIZIZ++;
                    byte b5 = this.LIZ.readByte();
                    int i3 = i2 | ((b4 & 127) << 21) | (b5 << 28);
                    if (b5 >= 0) {
                        return i3;
                    }
                    int i4 = 0;
                    do {
                        this.LIZ.LLIIII(1L);
                        this.LIZIZ++;
                        if (this.LIZ.readByte() >= 0) {
                            return i3;
                        }
                        i4++;
                    } while (i4 < 5);
                    throw new ProtocolException("Malformed VARINT");
                }
                i = b4 << 21;
            }
        }
        return i2 | i;
    }

    public long beginMessage() {
        if (this.LJ != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.LIZLLL + 1;
        this.LIZLLL = i;
        if (i > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j = this.LJI;
        this.LJI = -1L;
        this.LJ = 6;
        return j;
    }

    public int nextTag() {
        int i = this.LJ;
        if (i == 7) {
            this.LJ = 2;
            return this.LJFF;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.LIZIZ < this.LIZJ && !this.LIZ.LJJJJLL()) {
            int iLIZJ = LIZJ();
            if (iLIZJ == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = iLIZJ >> 3;
            this.LJFF = i2;
            int i3 = iLIZJ & 7;
            if (i3 == 0) {
                this.LJII = FieldEncoding.VARINT;
                this.LJ = 0;
                return i2;
            }
            if (i3 == 1) {
                this.LJII = FieldEncoding.FIXED64;
                this.LJ = 1;
                return i2;
            }
            if (i3 == 2) {
                this.LJII = FieldEncoding.LENGTH_DELIMITED;
                this.LJ = 2;
                int iLIZJ2 = LIZJ();
                if (iLIZJ2 < 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Negative length: ");
                    sbLIZ.append(iLIZJ2);
                    throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (this.LJI != -1) {
                    throw new IllegalStateException();
                }
                long j = this.LIZJ;
                this.LJI = j;
                long j2 = this.LIZIZ + ((long) iLIZJ2);
                this.LIZJ = j2;
                if (j2 <= j) {
                    return this.LJFF;
                }
                throw new EOFException();
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i3 == 5) {
                    this.LJII = FieldEncoding.FIXED32;
                    this.LJ = 5;
                    return i2;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unexpected field encoding: ");
                sbLIZ2.append(i3);
                throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            LIZLLL(i2);
        }
        return -1;
    }

    public int readFixed32() throws IOException {
        int i = this.LJ;
        if (i != 5 && i != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected FIXED32 or LENGTH_DELIMITED but was ");
            sbLIZ.append(this.LJ);
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.LLIIII(4L);
        this.LIZIZ += 4;
        int iLJJIFFI = this.LIZ.LJJIFFI();
        LIZ(5);
        return iLJJIFFI;
    }

    public long readFixed64() throws IOException {
        int i = this.LJ;
        if (i != 1 && i != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected FIXED64 or LENGTH_DELIMITED but was ");
            sbLIZ.append(this.LJ);
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.LLIIII(8L);
        this.LIZIZ += 8;
        long jLJIIJ = this.LIZ.LJIIJ();
        LIZ(1);
        return jLJIIJ;
    }

    public int readVarint32() {
        int i = this.LJ;
        if (i == 0 || i == 2) {
            int iLIZJ = LIZJ();
            LIZ(0);
            return iLIZJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected VARINT or LENGTH_DELIMITED but was ");
        sbLIZ.append(this.LJ);
        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public long readVarint64() {
        int i = this.LJ;
        if (i != 0 && i != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected VARINT or LENGTH_DELIMITED but was ");
            sbLIZ.append(this.LJ);
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        long j = 0;
        int i2 = 0;
        do {
            this.LIZ.LLIIII(1L);
            this.LIZIZ++;
            byte b = this.LIZ.readByte();
            j |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                LIZ(0);
                return j;
            }
            i2 += 7;
        } while (i2 < 64);
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public void skip() throws IOException {
        int i = this.LJ;
        if (i == 0) {
            readVarint64();
            return;
        }
        if (i == 1) {
            readFixed64();
            return;
        }
        if (i == 2) {
            this.LIZ.skip(LIZIZ());
        } else {
            if (i != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            readFixed32();
        }
    }

    public ByteString readBytes() throws ProtocolException {
        long jLIZIZ = LIZIZ();
        this.LIZ.LLIIII(jLIZIZ);
        return this.LIZ.LJLILLLLZI(jLIZIZ);
    }

    public String readString() throws ProtocolException {
        long jLIZIZ = LIZIZ();
        this.LIZ.LLIIII(jLIZIZ);
        return this.LIZ.LJJIIJ(jLIZIZ);
    }

    public FieldEncoding peekFieldEncoding() {
        return this.LJII;
    }

    public ProtoReader(InterfaceC1496620p36 interfaceC1496620p36) {
        this.LIZ = interfaceC1496620p36;
    }

    public final void LIZ(int i) throws IOException {
        if (this.LJ == i) {
            this.LJ = 6;
            return;
        }
        long j = this.LIZIZ;
        long j2 = this.LIZJ;
        if (j <= j2) {
            if (j == j2) {
                this.LIZJ = this.LJI;
                this.LJI = -1L;
                this.LJ = 6;
                return;
            }
            this.LJ = 7;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected to end at ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" but was ");
        sbLIZ.append(this.LIZIZ);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL(int i) throws IOException {
        while (this.LIZIZ < this.LIZJ && !this.LIZ.LJJJJLL()) {
            int iLIZJ = LIZJ();
            if (iLIZJ != 0) {
                int i2 = iLIZJ >> 3;
                int i3 = iLIZJ & 7;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 == 5) {
                                        this.LJ = 5;
                                        readFixed32();
                                    } else {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("Unexpected field encoding: ");
                                        sbLIZ.append(i3);
                                        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                } else if (i2 == i) {
                                    return;
                                } else {
                                    throw new ProtocolException("Unexpected end group");
                                }
                            } else {
                                LIZLLL(i2);
                            }
                        } else {
                            long jLIZJ = LIZJ();
                            this.LIZIZ += jLIZJ;
                            this.LIZ.skip(jLIZJ);
                        }
                    } else {
                        this.LJ = 1;
                        readFixed64();
                    }
                } else {
                    this.LJ = 0;
                    readVarint64();
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }

    public void endMessage(long j) {
        if (this.LJ == 6) {
            int i = this.LIZLLL - 1;
            this.LIZLLL = i;
            if (i >= 0 && this.LJI == -1) {
                if (this.LIZIZ != this.LIZJ && i != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expected to end at ");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(" but was ");
                    sbLIZ.append(this.LIZIZ);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LIZJ = j;
                return;
            }
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        throw new IllegalStateException("Unexpected call to endMessage()");
    }
}
