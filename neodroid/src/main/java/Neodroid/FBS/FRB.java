// automatically generated by the FlatBuffers compiler, do not modify

package Neodroid.FBS;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class FRB extends Table {
  public static FRB getRootAsFRB(ByteBuffer _bb) {
    return getRootAsFRB(_bb, new FRB());
  }

  public static FRB getRootAsFRB(ByteBuffer _bb, FRB obj) {
    _bb.order(ByteOrder.LITTLE_ENDIAN);
    return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
  }

  public FRB __assign(int _i, ByteBuffer _bb) {
    __init(_i, _bb);
    return this;
  }

  public void __init(int _i, ByteBuffer _bb) {
    bb_pos = _i;
    bb = _bb;
  }

  public static void startFRB(FlatBufferBuilder builder) {
    builder.startObject(1);
  }

  public static void addBody(FlatBufferBuilder builder, int bodyOffset) {
    builder.addStruct(0, bodyOffset, 0);
  }

  public static int endFRB(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // body
    return o;
  }

  public FBody body() {
    return body(new FBody());
  }

  public FBody body(FBody obj) {
    int o = __offset(4);
    return o != 0 ? obj.__assign(o + bb_pos, bb) : null;
  }
}

